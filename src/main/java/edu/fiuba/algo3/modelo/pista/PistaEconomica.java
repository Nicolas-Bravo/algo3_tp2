package edu.fiuba.algo3.modelo.pista;

import edu.fiuba.algo3.modelo.Banco;
import edu.fiuba.algo3.modelo.Edificio;

public class PistaEconomica extends Pista {
    public PistaEconomica(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {
        return new Banco(this);
    }
}
