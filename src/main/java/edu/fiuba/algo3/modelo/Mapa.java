package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;
import java.util.Collections;

public class Mapa {

    private ArrayList<Destino> destinos;
    private Destino destinoActual;
    private CalculadorDistancias calculadorDistancias;

    public Mapa(Destino... destinos_p) {
        this.destinos = new ArrayList<>();

        Collections.addAll(this.destinos, destinos_p);

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

    public Pista entrar(Reloj reloj, Edificio edificio) {
        return this.destinoActual.entrar(reloj,edificio);
    }
}
