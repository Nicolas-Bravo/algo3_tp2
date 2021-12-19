package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Caso {

    private final Sospechoso ladronReal;
    private boolean orden;
    private ArrayList<Sospechoso> sospechososTotales;


    public Caso(String nombre){
        this.sospechososTotales = BuscadorDeSospechosos.obtenerTodosLosSospechosos();
        this.ladronReal = BuscadorDeSospechosos.obtenerSospechosoPorNombre(nombre, sospechososTotales);
        this.orden = false;
    }

    public void emitirOrden(Sospechoso sospechoso){
        if(this.ladronReal.coincideCon(sospechoso)){
            this.orden = true;
        }
    }

    public void arresteSospechoso(Policia policia) {
        if (orden) {
            policia.sumarArresto();
        }
    }

    public ArrayList<Sospechoso> buscarSospechosos(Pista[] datos) {
        return BuscadorDeSospechosos.buscarSospechosos(sospechososTotales, datos);
    }
}
