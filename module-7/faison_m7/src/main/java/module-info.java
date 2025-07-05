module app {
    requires javafx.controls;
    requires javafx.fxml;

    opens myapp to javafx.fxml;
    exports myapp;
}
