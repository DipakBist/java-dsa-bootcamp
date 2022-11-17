module com.example.firstideaprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstideaprogram to javafx.fxml;
    exports com.example.firstideaprogram;
}