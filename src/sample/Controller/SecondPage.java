package sample.Controller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.HashMap;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SecondPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ThirdPagebutton;

    @FXML
    private Button FirstPagebutton;

    @FXML
    private Button buttonMinus1;

    @FXML
    private Label labelpage_2Amount1;

    @FXML
    private Button buttonMinus3;

    @FXML
    private Label labelpage_2Amount3;

    @FXML
    private Button buttonMinus5;

    @FXML
    private Label labelpage_2Amount5;

    @FXML
    private Button buttonMinus6;

    @FXML
    private Label labelpage_2Amount6;

    @FXML
    private Button buttonMinus2;

    @FXML
    private Label labelpage_2Amount2;

    @FXML
    private Button buttonMinus4;

    @FXML
    private Label labelpage_2Amount4;

    /* Количетво напитков начиналось с 0*/


    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;




    @FXML
    void initialize() {
        /* Переключатель вперед и назад*/
        //PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1));
        FirstPagebutton.setOnAction(event -> {
            PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1));
            pauseTransition.setOnFinished(event1 ->openNewScene("/sample/View/FirstPage.fxml"));
        });

        ThirdPagebutton.setOnAction(event -> {
            PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1));
            pauseTransition.setOnFinished(event1 ->openNewScene("/sample/View/ThirdPage.fxml"));
        });

        FirstPagebutton.setOnAction(event -> {
            openNewScene("/sample/View/FirstPage.fxml");
        });
        ThirdPagebutton.setOnAction(event -> {
            openNewScene("/sample/View/ThirdPage.fxml");
        });
    }

    public void  openNewScene(String window ){
        /*Переключатель назад*/
        FirstPagebutton.getScene().getWindow().hide();
        ThirdPagebutton.getScene().getWindow().hide();

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

    /*  Записывает в label  , переключает плюс и минус* напитки */

    @FXML
    private void handleMinus1() {
        if (number1 == 0) {
            buttonMinus1.setCancelButton(false);
        } else {
            --number1;
            labelpage_2Amount1.setText(String.valueOf(this.number1));
        }

    }
    @FXML
    private void handlePlus1() {
        ++this.number1;
        labelpage_2Amount1.setText(String.valueOf(this.number1));
    }

    @FXML
    private void handlePlus2() {
        ++this.number2;
        labelpage_2Amount2.setText(String.valueOf(this.number2));
    }


    @FXML
    private void handleMinus2() {
        if (this.number2 == 0) {
            this.buttonMinus2.setCancelButton(false);
        } else {
            --this.number2;
            this.labelpage_2Amount2.setText(String.valueOf(this.number2));
        }

    }

    @FXML
    private void handlePlus3() {
        ++this.number3;
        this.labelpage_2Amount3.setText(String.valueOf(this.number3));
    }

    @FXML
    private void handleMinus3() {
        if (this.number3 == 0) {
            this.buttonMinus3.setCancelButton(false);
        } else {
            --this.number3;
            this.labelpage_2Amount3.setText(String.valueOf(this.number3));
        }

    }

    @FXML
    private void handlePlus4() {
        ++this.number4;
        this.labelpage_2Amount4.setText(String.valueOf(this.number4));
    }

    @FXML
    private void handleMinus4() {
        if (this.number4 == 0) {
            this.buttonMinus4.setCancelButton(false);
        } else {
            --this.number4;
            this.labelpage_2Amount4.setText(String.valueOf(this.number4));
        }

    }

    @FXML
    private void handlePlus5() {
        ++this.number5;
        this.labelpage_2Amount5.setText(String.valueOf(this.number5));
    }

    @FXML
    private void handleMinus5() {
        if (this.number5 == 0) {
            this.buttonMinus5.setCancelButton(false);
        } else {
            --this.number5;
            this.labelpage_2Amount5.setText(String.valueOf(this.number5));
        }

    }

    @FXML
    private void handlePlus6() {
        ++this.number6;
        this.labelpage_2Amount6.setText(String.valueOf(this.number6));
    }

    @FXML
    private void handleMinus6() {
        if (this.number6 == 0) {
            this.buttonMinus6.setCancelButton(false);
        } else {
            --this.number6;
            this.labelpage_2Amount6.setText(String.valueOf(this.number6));
        }

    }



}

