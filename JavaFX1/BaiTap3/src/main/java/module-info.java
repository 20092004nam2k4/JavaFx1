module com.example.baitap3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baitap3 to javafx.fxml;
    exports com.example.baitap3;
}