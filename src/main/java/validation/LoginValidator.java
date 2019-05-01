package validation;

import expection.IncorrectInputException;
import expection.ObjectNotFoundException;
import request.LoginForm;
import service.UserService;
import service.UserServiceImpl;

public class LoginValidator {

    private UserService userService;

    public LoginValidator() {
        userService = new UserServiceImpl();
    }

    public void validate(LoginForm target) throws ObjectNotFoundException, IncorrectInputException {

        if (!RegexValidator.usernameValidation(target.getUsername()))
            throw new IncorrectInputException("Incorrect username pattern");

        if (!RegexValidator.passwordValidation(target.getPassword()))
            throw new IncorrectInputException("Incorrect password pattern");


        boolean usernameNotFound = userService.findUserByUsername(target.getUsername()) == null;


        if (usernameNotFound)
            throw new ObjectNotFoundException("User not found");
    }

}
