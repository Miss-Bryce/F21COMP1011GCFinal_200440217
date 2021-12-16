module com.example.f21comp1011gcfinala {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;


    opens com.example.f21comp1011gcfinala to javafx.fxml;
    exports com.example.f21comp1011gcfinala;
}