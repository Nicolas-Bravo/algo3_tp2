package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaBiblioteca;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

public class Biblioteca extends Edificio {
    public Biblioteca(PistaBiblioteca entrada) {
        super(entrada);
    }

    public Biblioteca(PistaGeneral entrada){
        super(entrada);
    }
}
