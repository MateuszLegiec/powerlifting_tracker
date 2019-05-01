package controller;

import Utils.AlterGenerator;
import dto.UserDTO;
import expection.IncorrectInputException;
import expection.ObjectNotFoundException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lombok.NoArgsConstructor;
import request.LoginForm;
import service.UserService;
import service.UserServiceImpl;
import validation.LoginValidator;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

@NoArgsConstructor
public class LoginController implements Initializable {

    @FXML
    TextField identityText;

    @FXML
    TextField passwordText;

    @FXML
    Button signInButton;

    @FXML
    Button signUpButton;

    private UserService userService = new UserServiceImpl();

    private LoginValidator loginValidator = new LoginValidator();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        signInButton.setOnMouseClicked(event -> tryLogin());
        signUpButton.setOnMouseClicked(event -> goToRegistration());
    }

    private void setAllTextFieldsClear(){
        identityText.clear();
        passwordText.clear();
    }

    private void tryLogin(){

        LoginForm loginForm = new LoginForm(identityText.getText(),passwordText.getText());
        setAllTextFieldsClear();

        try{
            loginValidator.validate(loginForm);

            UserDTO user = userService.findUserByUsername(loginForm.getUsername());

            //TODO password encoding
            if(!user.getPassword().equals(loginForm.getPassword()))
                throw new IncorrectInputException("Incorrect Password");

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Scene/MainWindowScene.fxml"));

            loader.load();

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setUserDTO(user);
            mainWindowController.setUserData();

            Parent root = loader.getRoot();
            Stage stage = (Stage) signUpButton.getScene().getWindow();
            //stage.setOnCloseRequest(e -> Platform.exit());
            stage.setOnCloseRequest(e -> System.exit(0));
            stage.setScene(new Scene(root,1280,720));
            stage.show();

        }catch (IncorrectInputException | ObjectNotFoundException e1){
            AlterGenerator.createSimpleAlter("Error","",e1.getMessage());
        }catch (IOException e2){
            e2.printStackTrace();
        }
    }

    private void goToRegistration(){
        try{

            Parent registrationParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Scene/RegistrationScene.fxml")));
            Stage registrationStage = (Stage) signUpButton.getScene().getWindow();
            registrationStage.setScene(new Scene(registrationParent,450,450));
            registrationStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
