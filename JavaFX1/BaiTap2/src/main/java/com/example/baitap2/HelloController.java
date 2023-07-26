package com.example.baitap2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
   @FXML
   TextField heightNano;
   @FXML
    TextField weightNano;

   @FXML
    public void calculateAge(){

       Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("chi so bmi");

       if(heightNano.getText().equals("") || weightNano.getText().equals("")){
           alert.setContentText("loi khong nhap chi so");
           alert.show();
       }else {
          double Height = Double.parseDouble(heightNano.getText());
          double Weight = Double.parseDouble(weightNano.getText());
          double Bmi = Height / (Math.pow(weightNano.getWidth(),2));
          alert.setContentText("chi so bmi la : " + Bmi);
          alert.show();
       }



   }
}