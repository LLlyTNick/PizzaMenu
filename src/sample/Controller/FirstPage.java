package sample.Controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.HashMap;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import sample.DataBase.Const;
import sample.DataBase.DataBaseHandler;


public class FirstPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SecondPagebutton;

    @FXML
    private Button buttonMinus1;

    @FXML
    private Button buttonMinus2;

    @FXML
    private Button buttonMinus3;

    @FXML
    private Button buttonMinus4;

    @FXML
    private Button buttonMinus5;

    @FXML
    private Button buttonMinus6;

    @FXML
    private Label labelAmount1;

    @FXML
    private Label labelAmount2;

    @FXML
    private Label labelAmount4;

    @FXML
    private Label labelAmount3;

    @FXML
    private Label labelAmount6;

    @FXML
    private Label labelAmount5;
    @FXML
    private Label namePizza1;

    @FXML
    private Label namePizza2;

    @FXML
    private Label diametr1;

    @FXML
    private Label diametr2;

    @FXML
    private Label priicePizza1;

    @FXML
    private Label priicePizza2;

    @FXML
    private Label namePizza3;

    @FXML
    private Label namePizza5;

    @FXML
    private Label diametr3;

    @FXML
    private Label priicePizza3;

    @FXML
    private Label diametr5;

    @FXML
    private Label priicePizza5;

    @FXML
    private Label namePizza4;

    @FXML
    private Label namePizza6;

    @FXML
    private Label diametr4;

    @FXML
    private Label diametr6;

    @FXML
    private Label priicePizza4;

    @FXML
    private Label priicePizza6;

/* Количетво пицц начиналось с 0*/
    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;



    @FXML
    void initialize() {

        SecondPagebutton.setOnAction(event -> {
            PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1));
            pauseTransition.setOnFinished(event1 ->openNewScene("/sample/View/SecondPage.fxml"));
        });

        SecondPagebutton.setOnAction(event -> {
            openNewScene("/sample/View/SecondPage.fxml");
        });


    }

    private void  openNewScene(String window){
        /*Переключатель назад*/
        SecondPagebutton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));


        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

    /*  Записывает в label  , переключает плюс и минус пиццы*/
    @FXML
    private void handleMinus1() {
        if (number1 == 0) {
            buttonMinus1.setCancelButton(false);
        } else {
            --number1;
            labelAmount1.setText(String.valueOf(this.number1));
        }

    }
    @FXML
    private void handlePlus1() {
        ++this.number1;
        labelAmount1.setText(String.valueOf(this.number1));
    }

    @FXML
    private void handlePlus2() {
        ++this.number2;
        labelAmount2.setText(String.valueOf(this.number2));
    }


    @FXML
    private void handleMinus2() {
        if (this.number2 == 0) {
            this.buttonMinus2.setCancelButton(false);
        } else {
            --this.number2;
            this.labelAmount2.setText(String.valueOf(this.number2));
        }

    }

    @FXML
    private void handlePlus3() {
        ++this.number3;
        this.labelAmount3.setText(String.valueOf(this.number3));
    }

    @FXML
    private void handleMinus3() {
        if (this.number3 == 0) {
            this.buttonMinus3.setCancelButton(false);
        } else {
            --this.number3;
            this.labelAmount3.setText(String.valueOf(this.number3));
        }

    }

    @FXML
    private void handlePlus4() {
        ++this.number4;
        this.labelAmount4.setText(String.valueOf(this.number4));
    }

    @FXML
    private void handleMinus4() {
        if (this.number4 == 0) {
            this.buttonMinus4.setCancelButton(false);
        } else {
            --this.number4;
            this.labelAmount4.setText(String.valueOf(this.number4));
        }

    }

    @FXML
    private void handlePlus5() {
        ++this.number5;
        this.labelAmount5.setText(String.valueOf(this.number5));
    }

    @FXML
    private void handleMinus5() {
        if (this.number5 == 0) {
            this.buttonMinus5.setCancelButton(false);
        } else {
            --this.number5;
            this.labelAmount5.setText(String.valueOf(this.number5));
        }

    }

    @FXML
    private void handlePlus6() {
        ++this.number6;
        this.labelAmount6.setText(String.valueOf(this.number6));
    }

    @FXML
    private void handleMinus6() {
        if (this.number6 == 0) {
            this.buttonMinus6.setCancelButton(false);
        } else {
            --this.number6;
            this.labelAmount6.setText(String.valueOf(this.number6));
        }

    }

    public void ListOrder() {
        ObservableList<String> langs = FXCollections.observableArrayList();
        ListView<String> langsListView = new ListView<String>(langs);
        SecondPagebutton.setOnAction(event -> langs.add(labelAmount1.getText()));
        System.out.println("goods");
//        SecondPagebutton.setOnAction(event -> {
//            if ( labelAmount1.getText().equals("0")) {
//                langs.add(namePizza1.getText());
//                System.out.println("good");
//            }
            //System.out.println(langs);
    //});
    }
}



