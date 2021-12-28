package edu.fiuba.algo3.modelo.pista;

import edu.fiuba.algo3.modelo.Biblioteca;
import edu.fiuba.algo3.modelo.Edificio;

public class PistaBiblioteca extends Pista{
    public PistaBiblioteca(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {
        return new Biblioteca(this);
    }
}
