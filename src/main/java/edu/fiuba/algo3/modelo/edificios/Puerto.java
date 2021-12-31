package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.pistas.PistaPuerto;

public class Puerto extends Edificio {

    private final PistaGeneral imagen;

    public Puerto(PistaPuerto entrada) {
        super(entrada);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/6414/6414036.png");
    }

    @Override
    public String obtenerImagen() {
        return imagen.mostrarPista();
    }
}


