package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaEconomica;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

public class Banco extends Edificio {

    private final PistaGeneral imagen;

    public Banco(PistaEconomica entrada) {
        super(entrada);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/2830/2830284.png");

    }

    @Override
    public String obtenerImagen() {
        return imagen.mostrarPista();
    }
}
