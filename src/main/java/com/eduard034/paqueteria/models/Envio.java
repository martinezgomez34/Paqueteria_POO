package com.eduard034.paqueteria.models;

import javafx.beans.property.SimpleStringProperty;

public class Envio extends Paquete{
    private final SimpleStringProperty destinatario;

    public Envio(String ID, String descripcion, String destinatario, String fecha) {
        super(ID, descripcion,fecha);
        this.destinatario = new SimpleStringProperty(destinatario);
    }

    public String getDestinatario() {
        return destinatario.get();
    }

    public SimpleStringProperty destinatarioProperty() {
        return destinatario;
    }

}
