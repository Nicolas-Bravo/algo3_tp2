package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class RutaDeEscape {

    private final ArrayList<Destino> destinos;

    public RutaDeEscape(Destino... destinos_p){
        this.destinos = new ArrayList<>();

        Collections.addAll(this.destinos, destinos_p);
    }

    public boolean controlArresto(Destino destinoActual) {
        return destinoActual.equals(destinos.get(destinos.size()-1));
    }

    public Mapa obtenerMapa() {
        return new Mapa(this.destinos.toArray(new Destino[0]));
    }
}
