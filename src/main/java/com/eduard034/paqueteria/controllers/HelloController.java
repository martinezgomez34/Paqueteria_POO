package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void onClickAdministrador(MouseEvent event) {
        HelloApplication.newStage("administrador.fxml","Administrador");
    }

    @FXML
    void onClickEmpaquetador(MouseEvent event) {
        HelloApplication.newStage("empaquetador.fxml","Empaquetador");
    }

    @FXML
    void onClickEmpleado(MouseEvent event) {
        HelloApplication.newStage("empleado.fxml","Gastos");
    }

    @FXML
    void initialize() {

    }
}
