package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;
import java.util.Collections;

public class Destino {
    private String nombre;
    private ArrayList<Edificio> edificios;
    private double latitud;
    private double longitud;

    public Destino(String nombre_p, double lat, double lng, Edificio... edificios_p){
        this.nombre = nombre_p;
        this.latitud = lat;
        this.longitud = lng;

        this.edificios = new ArrayList<>();

        Collections.addAll(this.edificios, edificios_p);
    }

    public Pista entrar(Reloj reloj, Edificio edificio) {
        int index = this.edificios.indexOf(edificio);
        return this.edificios.get(index).entrar(reloj);
    }

    public double latitud() {
        return latitud;
    }

    public double longitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public String enlaceImagen() {
        return "https://www.mtl.org/sites/default/files/styles/playlist_banner_big/public/2020-03/31919H.jpg?itok=TQ_3b8Bj";
    }
}
