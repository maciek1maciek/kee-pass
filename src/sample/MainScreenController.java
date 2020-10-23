package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    private MainController mainController;

    @FXML
    private TableView<KeyPassData> TableView;



    public javafx.scene.control.TableView<KeyPassData> getTableView() {
        return TableView;
    }

    @FXML
    private TableColumn<KeyPassData,String> TitleColumn;
    @FXML
    private TableColumn<KeyPassData,String> LoginColumn;
    @FXML
    private TableColumn<KeyPassData,String> PassColumn;
    @FXML
    private TableColumn<KeyPassData,String> Pass2Column;
    @FXML
    private TableColumn<KeyPassData,String> URLColumn;
    @FXML
    private TableColumn<KeyPassData,String> NoticeColumn;



    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void add(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/Data.fxml"));
        FlowPane flowPane = null;

        try {
            flowPane=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataController dataController = loader.getController();    //pobranie kontrolera
        dataController.setMainController(mainController);           //przekazanie dataCotrnolera do kontrolera glowanego

        mainController.setScreenF(flowPane);  //ustawienie ekranu

    }

    public void nas(){
            Bundle bundle = new Bundle();
            bundle.dialog();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TitleColumn.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("Title"));    //ustawienia kolumn
        LoginColumn.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("Login"));
        PassColumn.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("Pass"));
        Pass2Column.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("Pass2"));
        URLColumn.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("URL"));
        NoticeColumn.setCellValueFactory(new PropertyValueFactory<KeyPassData,String>("Notice"));

        TableView.setItems(getData());

    }

    public ObservableList<KeyPassData> getData(){  //ta metoda zwraca observableList obiektow klasy KeyPassData
        ObservableList<KeyPassData> data = FXCollections.observableArrayList();
       addData(data);
        return data;
    }

    public void addData(ObservableList<KeyPassData> data){
        data.add(new KeyPassData("Facebook","Beny","Beniek123","brak","https:/facebook.com","tylko pamietaj"));
        data.add(KeyPassData.getLastGeneratedObject());
    }





}
