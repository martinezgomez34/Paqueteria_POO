package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import com.eduard034.paqueteria.models.DataBase;
import com.eduard034.paqueteria.models.Envio;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class envioController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Envio, String> descripcionColumn;

    @FXML
    private TextField descripcionText;

    @FXML
    private TableColumn<Envio, String> destinatarioColumn;

    @FXML
    private TextField destinatarioText;

    @FXML
    private TableColumn<Envio, String> fechaColumn;

    @FXML
    private TextField fechaText;

    @FXML
    private TableColumn<Envio, String> idColumn;

    @FXML
    private TableView<Envio> verTabla;

    @FXML
    void onClickActualizar(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        verTabla.getItems().clear();
        verTabla.getItems().addAll(date.getListenvios());
    }

    @FXML
    void onClickAgregar(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        Random generar = new Random();
        int idE = generar.nextInt(10000);
        String id = String.valueOf(idE);
        String nombre = destinatarioText.getText();
        String descripcion = descripcionText.getText();
        String fecha = fechaText.getText();
        Envio envio = new Envio(id,nombre,descripcion,fecha);
        date.getListenvios().add(envio);
        destinatarioText.clear();
        descripcionText.clear();
        fechaText.clear();
    }

    @FXML
    void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        destinatarioColumn.setCellValueFactory(cellData -> cellData.getValue().destinatarioProperty());
        descripcionColumn.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().fechaProperty());
    }

}
