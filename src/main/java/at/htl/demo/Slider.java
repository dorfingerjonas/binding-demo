package at.htl.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Slider implements Initializable {

    @FXML
    Button nextButton;

    @FXML
    Button previousButton;

    @FXML
    TextField textField;

    @FXML
    javafx.scene.control.Slider horizontalSlider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nextButton.setDisable(true);

        textField.textProperty().bindBidirectional(horizontalSlider.valueProperty(), new NumberStringConverter());

        previousButton.setOnAction(actionEvent -> {
            try {
                App.setRoot("TwoWayBinding");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}