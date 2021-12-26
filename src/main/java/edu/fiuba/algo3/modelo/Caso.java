package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Caso {

    private final RutaDeEscape rutaDeEscape;
    private int entradasfinales;
    private ArrayList<Sospechoso> sospechososTotales;
    private final Sospechoso ladronReal;
    private boolean orden;
    private final Tesoro tesoro;


    public Caso(String nombre, Tesoro tesoro_p, RutaDeEscape ruta){
        this.sospechososTotales = BuscadorDeSospechosos.obtenerTodosLosSospechosos();
        this.ladronReal = BuscadorDeSospechosos.obtenerSospechosoPorNombre(nombre, this.sospechososTotales);
        this.rutaDeEscape = ruta;
        this.orden = false;
        this.entradasfinales = 0;
        this.tesoro = tesoro_p;
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
        this.rutaDeEscape.controlArresto(destinoActual, pista, policia, this);
    }

    public Mapa obtenerMapa() {
        return this.rutaDeEscape.obtenerMapa(this.tesoro.obtenerInicio());
    }

    //
}
