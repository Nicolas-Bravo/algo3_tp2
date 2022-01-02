package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.edificios.Biblioteca;
import edu.fiuba.algo3.modelo.edificios.Edificio;

public class PistaGeneral extends Pista {
    public PistaGeneral(String pista) {
        super(pista);
    }

    public PistaGeneral(Pista obtenerNombre) {
        super(obtenerNombre);
    }

    @Override
    public Edificio obtenerEdificio() {
        return new Biblioteca(this);
    }


}
