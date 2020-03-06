package at.htl.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class TwoWayBindingController implements Initializable {

    @FXML
    TextArea textArea;

    @FXML
    TextArea secondTextArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}