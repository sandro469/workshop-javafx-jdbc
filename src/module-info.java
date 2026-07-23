module workshop.javafx.jdbc {

    requires javafx.controls;
    requires javafx.fxml;

    opens gui to javafx.fxml;
    opens model.entities to javafx.base;

    exports application;
    exports gui;
}