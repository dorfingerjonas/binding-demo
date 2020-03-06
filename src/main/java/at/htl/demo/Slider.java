package at.htl.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
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

    List<String> allowedValues = Arrays.asList("", "1", "2", "3", "4", "5");

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

        textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
            if (!allowedValues.contains(newValue)) {
                textField.setText(oldValue);
            }
        });
    }
}