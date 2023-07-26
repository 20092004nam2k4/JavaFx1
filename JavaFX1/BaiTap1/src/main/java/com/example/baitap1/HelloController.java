package com.example.baitap1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField value;

    @FXML
    protected void okiOki() {
        int vnd = 23000;
        int usd = vnd * Integer.parseInt(value.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("so tien da doi: " + usd);
        alert.show();
    }
}