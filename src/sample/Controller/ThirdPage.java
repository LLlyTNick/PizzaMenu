package sample.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ThirdPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SecondPagebutton;

    @FXML
    private Button FirstPagebutton;

    @FXML
    void initialize() {
        assert SecondPagebutton != null : "fx:id=\"SecondPagebutton\" was not injected: check your FXML file 'ThirdPage.fxml'.";
        assert FirstPagebutton != null : "fx:id=\"FirstPagebutton\" was not injected: check your FXML file 'ThirdPage.fxml'.";

    }
}


