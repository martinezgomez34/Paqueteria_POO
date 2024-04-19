package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import com.eduard034.paqueteria.models.DataBase;
import com.eduard034.paqueteria.models.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class empaquetadorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Paquete, String> descripcionColumn;

    @FXML
    private TextField descripcionText;

    @FXML
    private TableColumn<Paquete, String> fechaColumn;

    @FXML
    private TextField fechaText;

    @FXML
    private TableColumn<Paquete, String> idColumn;

    @FXML
    private TextField idText;

    @FXML
    private TableView<Paquete> verColumn;

    @FXML
    void onClickActualizar(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        verColumn.getItems().clear();
        verColumn.getItems().addAll(date.getListpaquetes());
    }

    @FXML
    void onClickAgregar(MouseEvent event) {
        String ID = idText.getText();
        String descripcion = descripcionText.getText();
        String fecha = fechaText.getText();
        Paquete paquete = new Paquete(ID,descripcion,fecha);
        HelloApplication.getDataBase().setListpaquetes(paquete);
        idText.clear();
        descripcionText.clear();
        fechaText.clear();
    }

    @FXML
    void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        descripcionColumn.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().fechaProperty());

    }

}