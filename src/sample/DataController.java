package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


import java.io.IOException;
import java.security.SecureRandom;

public class DataController {
    MainController mainController;
    MainScreenController mainScreenController;

    @FXML
    TextField Title;

    @FXML
    TextField Login;

    @FXML
     TextField Pass;

    @FXML
     TextField Pass2;

    @FXML
     TextField URL;

    @FXML
    TextField Notice;



    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void Anuluj(){
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
    }


    public void Add(){
        KeyPassData.setLastGeneratedObject(new KeyPassData(Title.getText(),
                Login.getText(),
                Pass.getText(),
                Pass2.getText(),
                URL.getText(),
                Notice.getText()));

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
    }

    public void generate(){
        Pass.setText(generateRandomPassword());
    }

    public static String generateRandomPassword()
    {
        final int len = 7;
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }





}
