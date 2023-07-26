module com.example.thuhanh4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thuhanh4 to javafx.fxml;
    exports com.example.thuhanh4;
}