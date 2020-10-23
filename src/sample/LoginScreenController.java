package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.io.IOException;


public class LoginScreenController {

    private MainController mainController;

    @FXML
    private StackPane stackPane;


    @FXML
    private PasswordField passText;

    @FXML
    private Label stat;


    @FXML
    public void Login(){
        if(passText.getText().equals("maciek")){
            stat.setText("Zalogowano");
            stat.setTextFill(Color.GREEN);

            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/MainScreen.fxml"));
            BorderPane borderPane = null;

            try {
                borderPane =loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            MainScreenController mainScreenController = loader.getController();
            mainScreenController.setMainController(mainController);

            mainController.setScreenB(borderPane);

        }else{
            stat.setText("Błędne hasło");
        }


    }
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }



}
