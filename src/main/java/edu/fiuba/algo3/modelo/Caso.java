package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Caso {

    private int entradasfinales;
    private ArrayList<Sospechoso> sospechososTotales;
    private final Sospechoso ladronReal;
    private boolean orden;


    public Caso(String nombre, RutaDeEscape ruta){
        this.sospechososTotales = BuscadorDeSospechosos.obtenerTodosLosSospechosos();
        this.ladronReal = BuscadorDeSospechosos.obtenerSospechosoPorNombre(nombre, this.sospechososTotales);
        this.ladronReal.asignarRuta(ruta);
        this.orden = false;
        this.entradasfinales = 0;
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

    public void controlArresto(Destino destinoActual, Pista pista, Policia policia) {
        if (this.ladronReal.controlArresto(destinoActual) ) {
            pista.sobreescribir("Sospechoso visto recientemente");
            if (this.entradasfinales == 1) {
                arresteSospechoso(policia);
            }
            this.entradasfinales++;
        }
    }

    public Mapa obtenerMapa() {
        return this.ladronReal.obtenerMapa();
    }

    //
}
