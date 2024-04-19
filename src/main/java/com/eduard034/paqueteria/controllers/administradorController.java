package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import com.eduard034.paqueteria.models.DataBase;
import com.eduard034.paqueteria.models.Envio;
import com.eduard034.paqueteria.models.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class administradorController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Envio, String> descripcionColumn;

    @FXML
    private TableColumn<Envio, String> fechaColumn;

    @FXML
    private TableColumn<Envio, String> idColumn;

    @FXML
    private TextField textoTotal;

    @FXML
    private TableView<Envio> verLista;

    @FXML
    void onClickVerLista(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        verLista.getItems().clear();
        verLista.getItems().addAll(date.getListenvios());
    }

    @FXML
    void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        descripcionColumn.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().fechaProperty());
    }

}
