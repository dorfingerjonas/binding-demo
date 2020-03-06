package at.htl.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TwoWayBindingController implements Initializable {

    @FXML
    TextArea textArea;

    @FXML
    TextArea secondTextArea;

    @FXML
    Button previousButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        secondTextArea.setText("");

        secondTextArea.textProperty().bindBidirectional(textArea.textProperty());

        previousButton.setOnAction(actionEvent -> {
            try {
                App.setRoot("OneWayBinding");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}