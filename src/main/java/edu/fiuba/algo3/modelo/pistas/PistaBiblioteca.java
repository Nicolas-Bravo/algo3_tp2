package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.edificios.Biblioteca;
import edu.fiuba.algo3.modelo.edificios.Edificio;

public class PistaBiblioteca extends Pista {
    public PistaBiblioteca(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {
        return new Biblioteca(this);
    }
}
