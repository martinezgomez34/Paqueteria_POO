package com.eduard034.paqueteria.controllers;

import com.eduard034.paqueteria.HelloApplication;
import com.eduard034.paqueteria.models.DataBase;
import com.eduard034.paqueteria.models.Paquete;
import com.eduard034.paqueteria.models.Recibido;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class reciboController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Paquete, String> descripcionColumn;

    @FXML
    private TableColumn<Recibido, String> fechaColumn;

    @FXML
    private TextField fechaRText;

    @FXML
    private TableColumn<Paquete, String> idColumn;

    @FXML
    private TextField idText;

    @FXML
    private TableColumn<Recibido, String> nombreColumn;

    @FXML
    private TextField nombreRText;

    @FXML
    private TableView<Recibido> verListaR;

    @FXML
    void onClickActualizarR(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        verListaR.getItems().clear();
        verListaR.getItems().addAll(date.getListrecibidos());
    }

    @FXML
    void onClickAgregarR(MouseEvent event) {
        DataBase date = HelloApplication.getDataBase();
        String id = idText.getText();
        String nombre = nombreRText.getText();
        String fechaDeRecibo = fechaColumn.getText();
        for (Paquete item : date.getListpaquetes()) {
            if (id.equals(item.getID())) {
                String descrip = item.getDescripcion();
                String fecha = item.getFecha();
                Recibido recibido = new Recibido(id,descrip,fecha,nombre,fechaDeRecibo);
                date.setListrecibidos(recibido);
                idText.clear();
                nombreRText.clear();
                fechaRText.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("No se encuentra el ID del paquete");
                alert.showAndWait();

            }

        }
    }

    @FXML
    void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        descripcionColumn.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().fechaDReciboProperty());

    }

}