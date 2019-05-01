package Utils;

import javafx.scene.control.Alert;

public class AlterGenerator {

    public static void createSimpleAlter(String name, String header, String message){
        Alert alert  = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(name);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.show();
    }

}
