package validation;

import domain.Gender;
import domain.User;
import expection.IncorrectInputException;
import expection.ObjectNotFoundException;
import expection.UserAlreadyExistException;
import request.RegistrationForm;
import service.UserService;
import service.UserServiceImpl;


public class RegistrationValidator{

    private final static UserService userService = new UserServiceImpl();

    public static void validate(RegistrationForm target) throws UserAlreadyExistException, IncorrectInputException, NumberFormatException {

        boolean notAllFieldsFilled = target.getPassword().isEmpty() || target.getUsername().isEmpty() || target.getBodyWeight().isEmpty() || target.getRepeatedPassword().isEmpty();

        if(notAllFieldsFilled)
            throw new IncorrectInputException("All fields have to be filled");

        if (!RegexValidator.passwordValidation(target.getPassword()))
            throw new IncorrectInputException(
                    "Password should have:/n " +
                            "* minimum 6 characters \n " +
                            "* at least one digit \n " +
                            "* at least one lower case letter \n " +
                            "* at least one upper case letter \n " +
                            "* not have any whitespace"
            );

        if(!RegexValidator.usernameValidation(target.getUsername()))
            throw new IncorrectInputException(
                    "Username should have \n " +
                            "* at least 4 characters \n " +
                            "* maximum 16 characters \n " +
                            "* not special characters");

        if(target.getGender() == null)
            throw new IncorrectInputException("Unselected gender");

        Double weight = Double.parseDouble(target.getBodyWeight());

        if(weight<=40 || (target.getGender().equals(Gender.MALE) && weight>206) || (target.getGender().equals(Gender.FEMALE) && weight>151))
            throw new IncorrectInputException("Body weight should be in range \n Female: <40,151) \n Male: <40,206)");

        if (!target.getPassword().equals(target.getRepeatedPassword()))
            throw new IncorrectInputException("The passwords are different");

        boolean usernameAlreadyUsed;

        try {
            userService.findUserByUsername(target.getUsername());
            usernameAlreadyUsed = true;
        }catch (ObjectNotFoundException e){
            usernameAlreadyUsed = false;
        }

        if (usernameAlreadyUsed)
            throw new UserAlreadyExistException(User.class,"username",target.getUsername());

    }
}
