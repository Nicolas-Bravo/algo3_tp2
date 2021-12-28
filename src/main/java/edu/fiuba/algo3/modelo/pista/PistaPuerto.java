package edu.fiuba.algo3.modelo.pista;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Puerto;

public class PistaPuerto extends Pista{
    public PistaPuerto(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {
        return new Puerto(this);
    }
}
