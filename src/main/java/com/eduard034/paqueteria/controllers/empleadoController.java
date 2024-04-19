package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class empleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void onCLickEnvio(MouseEvent event) {
        HelloApplication.newStage("envio.fxml","Envio");
    }

    @FXML
    void onCLickRecibo(MouseEvent event) {
        HelloApplication.newStage("recibo.fxml","Recibo");
    }

    @FXML
    void initialize() {

    }

}
