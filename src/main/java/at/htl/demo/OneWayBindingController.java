package at.htl.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OneWayBindingController implements Initializable {

    @FXML
    TextArea textArea;

    @FXML
    Button showButton;

    @FXML
    Label label;

    @FXML
    Button nextButton;

    @FXML
    Button previousButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        label.setText("");
        previousButton.setDisable(true);

        showButton.disableProperty().bind(textArea.textProperty().isEmpty());

        label.textProperty().bind(textArea.textProperty());

        showButton.setOnAction(actionEvent -> {
            label.setText(textArea.getText());
        });

        nextButton.setOnAction(actionEvent -> {
            try {
                App.setRoot("TwoWayBinding");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}