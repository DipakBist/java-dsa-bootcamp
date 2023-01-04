module com.example.oopintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopintro to javafx.fxml;
    exports com.example.oopintro;
}