package edu.fiuba.algo3.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sospechoso {

    private final ArrayList<Pista>descripcion;
    private final String nombre;
    private RutaDeEscape rutaDeEscape;


    public Sospechoso(Pista... pistas){

        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, pistas);

        this.nombre = this.descripcion.get(0).mostrarPista();

    }

    public void coincideCon(Pista[] pistas, ArrayList<Sospechoso> sospechososPosibles) {
        if(descripcion.containsAll(List.of(pistas))){
            sospechososPosibles.add(this);
        }
    }
    public boolean coincideCon(String nombre) {
        return nombre.equals(this.nombre);
    }

    public boolean coincideCon(Sospechoso sospechoso) {
        return this.descripcion.containsAll(sospechoso.descripcion);
    }

    @Override
    public boolean equals(Object sospechoso) {
        return this.coincideCon((Sospechoso)sospechoso);
    }

    public void asignarRuta(RutaDeEscape ruta) {
        this.rutaDeEscape = ruta;
    }

    public boolean controlArresto(Destino destinoActual) {
        return this.rutaDeEscape.controlArresto(destinoActual);
    }

    public Mapa obtenerMapa() {
        return this.rutaDeEscape.obtenerMapa();
    }
}

