module com.example.thuhanh3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thuhanh3 to javafx.fxml;
    exports com.example.thuhanh3;
}