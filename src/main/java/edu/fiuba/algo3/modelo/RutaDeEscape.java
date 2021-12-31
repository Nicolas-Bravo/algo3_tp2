package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;
import java.util.Collections;

public class RutaDeEscape {

    public final ArrayList<Destino> destinos;
    private int entradasfinales;

    public RutaDeEscape(Destino... destinos_p){
        this.destinos = new ArrayList<>();

        Collections.addAll(this.destinos, destinos_p);

        this.entradasfinales = 0;
    }

    public void controlArresto(Destino destinoActual, Pista pista, Policia policia, Caso caso) {
        if( destinoActual.equals(destinos.get(destinos.size()-1)) ){
            pista.sobreescribir("Sospechoso visto recientemente");
            if (this.entradasfinales == 1) {
                caso.arresteSospechoso(policia);
            }
            this.entradasfinales++;
        }
    }

    public Mapa obtenerMapa() {
        return new Mapa(this.destinos.toArray(new Destino[0]));
    }

    public int largo() { return this.destinos.size();
    }
}
