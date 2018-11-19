package org.francoisbasset.calculator.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class MainController {
    @FXML
    public TextField calculTextField;

    StringBuilder calcul = new StringBuilder();

    @FXML
    public void onSymbolButtonClick(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();

        calcul.append(button.getText());

        calculTextField.setText(calcul.toString());
    }

    @FXML
    public void onEqualButtonClick() {
        Alert alert = new Alert(Alert.AlertType.NONE, calculTextField.getText(), ButtonType.CLOSE);

        alert.show();
    }

    @FXML
    public void onKeyRelease(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.BACK_SPACE && calcul.length() > 0) {
            calcul.deleteCharAt(calcul.length() - 1);

            calculTextField.setText(calcul.toString());
        }
    }
}
