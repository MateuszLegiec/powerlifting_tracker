package controller;

import Utils.AlterGenerator;
import domain.Gender;
import dto.UserDTO;
import expection.IncorrectInputException;
import expection.UserAlreadyExistException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;
import mapper.RegistrationFormMapper;
import request.RegistrationForm;
import service.UserService;
import service.UserServiceImpl;
import validation.RegistrationValidator;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


@NoArgsConstructor
public class RegistrationController implements Initializable {


    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    PasswordField repeatedPassword;

    @FXML
    TextField weight;

    @FXML
    CheckBox femaleChecker;

    @FXML
    CheckBox maleChecker;

    @FXML
    Button signUpButton;


    private final UserService userService = new UserServiceImpl();


    private void clearInput(){
        username.clear();
        password.clear();
        repeatedPassword.clear();
        weight.clear();
        femaleChecker.setSelected(false);
        maleChecker.setSelected(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        signUpButton.setOnMouseClicked(event -> tryRegister());
        femaleChecker.setOnMouseClicked(event -> maleChecker.setSelected(false));
        maleChecker.setOnMouseClicked(event -> femaleChecker.setSelected(false));
    }

    private Gender selectedCheckBoxToGenderMapper(){
        if(maleChecker.isSelected()){
            return Gender.MALE;
        }else if(femaleChecker.isSelected()){
            return Gender.FEMALE;
        }else{
            return null;
        }
    }

    private void tryRegister(){


        try{
            RegistrationForm form = RegistrationForm.builder()
                    .username(this.username.getText())
                    .password(this.password.getText())
                    .repeatedPassword(this.repeatedPassword.getText())
                    .bodyWeight(this.weight.getText())
                    .gender(selectedCheckBoxToGenderMapper())
                    .build();

            RegistrationValidator.validate(form);

            clearInput();

            UserDTO userDTO = RegistrationFormMapper.registrationFormToUserDTO(form);
            userService.save(userDTO);

            Parent loginParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Scene/LoginScene.fxml")));
            Scene loginScene = new Scene(loginParent,800,400);
            Stage loginStage = (Stage) signUpButton.getScene().getWindow();
            loginStage.setScene(loginScene);
            loginStage.show();

        }catch (UserAlreadyExistException | IncorrectInputException | NullPointerException e1){
            AlterGenerator.createSimpleAlter("Error","",e1.getMessage());
        } catch (NumberFormatException e2){
            AlterGenerator.createSimpleAlter("Error","","Body weight should be in range \n Female: <40,151) \n Male: <40,206)");
        } catch (IOException e3){
            e3.printStackTrace();
        }
    }
}
