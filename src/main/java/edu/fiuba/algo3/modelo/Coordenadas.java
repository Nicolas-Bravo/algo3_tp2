package edu.fiuba.algo3.modelo;

public class Coordenadas {

    private double latitud;
    private double longitud;

    public Coordenadas(double lat, double lng){
        this.latitud = lat;
        this.longitud = lng;
    }

    public double latitud() {
        return this.latitud;
    }

    public double longitud() {
        return this.longitud;
    }
}
