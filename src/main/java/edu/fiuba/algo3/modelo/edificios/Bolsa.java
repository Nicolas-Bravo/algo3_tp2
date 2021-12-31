package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaEconomica;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

public class Bolsa extends Edificio {
    private final PistaGeneral imagen;

    public Bolsa(PistaEconomica pista) {
        super(pista);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/6410/6410318.png");

    }

    @Override
    public String obtenerImagen() {
        return imagen.mostrarPista();
    }
}
