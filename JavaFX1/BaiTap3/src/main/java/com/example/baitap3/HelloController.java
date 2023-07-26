package com.example.baitap3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField value1;
    @FXML
    TextField value2;
    @FXML
    Label resultLabel;



    @FXML
    protected void add() {
        int Value1 = Integer.parseInt(value1.getText());
        int Value2 = Integer.parseInt(value2.getText());

        int age = Value1 + Value2;
        resultLabel.setText("ket qua cong: " + age);
    }

    @FXML
    protected void subtract(){
        int Value1 = Integer.parseInt(value1.getText());
        int Value2 = Integer.parseInt(value2.getText());

        int age = Value1 - Value2;
        resultLabel.setText("ket qua tru: " + age);
    }
    @FXML
    protected void multiply(){
        int Value1 = Integer.parseInt(value1.getText());
        int Value2 = Integer.parseInt(value2.getText());

        int age = Value1 * Value2;
        resultLabel.setText("ket qua nhan: " + age);
    }
    @FXML
    protected void divide(){
        int Value1 = Integer.parseInt(value1.getText());
        int Value2 = Integer.parseInt(value2.getText());

        if (Value2 != 0) {
            double result = Value1 / Value2;
            resultLabel.setText("Kết quả: " + result);
        } else {
            resultLabel.setText("Không thể chia cho 0");
        }
    }
}