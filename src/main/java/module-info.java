module com.eduard034.paqueteria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.eduard034.paqueteria to javafx.fxml;
    exports com.eduard034.paqueteria;
    exports com.eduard034.paqueteria.controllers;
    opens com.eduard034.paqueteria.controllers to javafx.fxml;
}