package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;
import java.util.Collections;

public class Mapa {

    private ArrayList<Destino> destinos;
    private Destino destinoActual;

    public Mapa(Destino... destinos_p) {
        this.destinos = new ArrayList<>();

        Collections.addAll(this.destinos, destinos_p);

        for (int i=0; i < this.destinos.size()-1; i++){
            this.destinos.get(i).agregarDestinoPosible(this.destinos.get(i+1));
        }

        for (int i=1; i < this.destinos.size(); i++){
            this.destinos.get(i).agregarDestinoPosible(this.destinos.get(i-1));
        }

        this.destinos = BuscadorDeDestinos.completarMapa(this.destinos);

        this.destinoActual = this.destinos.get(0);
    }

    public double viajar(Destino destino) {
        int index = this.destinoActual.destinosPosibles().indexOf(destino);
        double distancia = this.destinoActual.distanciaCon(destino.obtenerCordenadas(), "K");
        this.destinoActual = this.destinoActual.destinosPosibles().get(index);
        return distancia;
    }

    public Destino destinoActual() {
        return this.destinoActual;
    }

    public ArrayList<Destino> destinosPosible(){
        return this.destinoActual.destinosPosibles();
    }

    public Pista entrar(Reloj reloj, Edificio edificio) {
        return this.destinoActual.entrar(reloj,edificio);
    }
}
