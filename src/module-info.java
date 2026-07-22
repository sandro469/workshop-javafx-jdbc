module workshop.javafx.jdbc {
    requires javafx.controls;
    requires javafx.fxml;

    opens gui to javafx.fxml;

    exports application;
    exports gui;
}