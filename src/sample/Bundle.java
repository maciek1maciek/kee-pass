package sample;

import javafx.scene.control.Alert;


public class Bundle {


    public static void dialog(){
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("O nas ");
        informationAlert.setHeaderText("Drogi czytelniku");
        informationAlert.setContentText("Aplikacja ta została stworzona za pomocą JavyFx przez Maciej Koczyka ");

        informationAlert.showAndWait();
    }
}
