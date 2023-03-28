module com.example.vizsgaremek {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vizsgaremek to javafx.fxml;
    exports com.example.vizsgaremek;
}