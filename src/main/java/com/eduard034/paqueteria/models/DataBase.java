package com.eduard034.paqueteria.models;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Paquete> listpaquetes = new ArrayList<>();
    ArrayList<Envio> listenvios = new ArrayList<>();
    ArrayList<Recibido> listrecibidos = new ArrayList<>();


    public ArrayList<Paquete> getListpaquetes() {
        return listpaquetes;
    }

    public ArrayList<Envio> getListenvios() {
        return listenvios;
    }

    public ArrayList<Recibido> getListrecibidos() {
        return listrecibidos;
    }

    public boolean setListpaquetes(Paquete paquete) {
        return listpaquetes.add(paquete);
    }

    public boolean setListenvios(Envio envios) {
        return listenvios.add(envios);
    }

    public boolean setListrecibidos(Recibido recibidos) {
        return listrecibidos.add(recibidos);
    }

}
