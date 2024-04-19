package com.eduard034.paqueteria.models;

import javafx.beans.property.SimpleStringProperty;

import java.util.Objects;

public class Paquete {
    private final SimpleStringProperty ID;
    private final SimpleStringProperty descripcion;
    private final SimpleStringProperty fecha;

    public Paquete(String ID, String descripcion, String fecha) {
        this.ID = new SimpleStringProperty(ID);
        this.descripcion = new SimpleStringProperty(descripcion);
        this.fecha = new SimpleStringProperty(fecha);
    }

    public String getID() {
        return ID.get();
    }

    public SimpleStringProperty IDProperty() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public SimpleStringProperty descripcionProperty() {
        return descripcion;
    }

    public String getFecha() {
        return fecha.get();
    }

    public SimpleStringProperty fechaProperty() {
        return fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paquete)) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(getID(), paquete.getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID());
    }
}
