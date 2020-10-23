package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane stackPane;

    @FXML
    public void initialize(){
        loadLoginScreen();
    }

    private void loadLoginScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/LoginScreen.fxml"));
        FlowPane flowPane= null;

        try {
            flowPane =loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stackPane.getChildren().clear();
        stackPane.getChildren().add(flowPane);

        LoginScreenController loginScreenController = loader.getController();
        loginScreenController.setMainController(this);
    }

    public void setScreenB(BorderPane borderPane){
        stackPane.getChildren().clear();
        stackPane.getChildren().add(borderPane);
    }
    public void setScreenF(FlowPane flowPane){
        stackPane.getChildren().clear();
        stackPane.getChildren().add(flowPane);
    }


}
