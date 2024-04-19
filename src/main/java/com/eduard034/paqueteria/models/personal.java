package com.eduard034.paqueteria.models;

public class personal {
    private int id;
    private String nombre;
    private int telefono;
    private String correo;

    public personal(int id, String nombre, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}
