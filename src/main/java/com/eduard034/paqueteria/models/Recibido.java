package com.eduard034.paqueteria.models;

import javafx.beans.property.SimpleStringProperty;

public class Recibido extends Paquete {
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty fechaDRecibo;

    public Recibido(String ID, String descripcion, String fecha, String nombre, String fechaDRecibo) {
        super(ID, descripcion,fecha);
        this.nombre = new SimpleStringProperty(nombre);
        this.fechaDRecibo = new SimpleStringProperty(fechaDRecibo);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public String getFechaDRecibo() {
        return fechaDRecibo.get();
    }

    public SimpleStringProperty fechaDReciboProperty() {
        return fechaDRecibo;
    }
}
