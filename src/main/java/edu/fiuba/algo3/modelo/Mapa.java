package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Mapa {

    private ArrayList<Destino> destinos;
    private Destino destinoActual;
    private CalculadorDistancias calculadorDistancias;

    public Mapa(Destino... destinos_p) {
        this.destinos = new ArrayList<>();

        for (int i=0; i<destinos_p.length; i++){
            this.destinos.add(destinos_p[i]);
        }

        this.destinoActual = this.destinos.get(0);
        this.calculadorDistancias = new CalculadorDistancias();
    }

    public int viajar(Destino destino) {
        int index = this.destinos.indexOf(destino);
        this.destinoActual = destinos.get(index);
        return this.calculadorDistancias.distancia(this.destinoActual, destino);
    }

    public Destino destinoActual() {
        return this.destinoActual;
    }
}
