module com.example.server0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.server0 to javafx.fxml;
    exports com.example.server0;
}