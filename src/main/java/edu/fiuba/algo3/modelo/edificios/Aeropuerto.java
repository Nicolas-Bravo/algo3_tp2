package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.pistas.PistaPuerto;
import javafx.scene.image.Image;

public class Aeropuerto extends Edificio {

    private final PistaGeneral imagen;

    public Aeropuerto(PistaPuerto entrada) {
        super(entrada);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/3127/3127386.png");

    }

    @Override
    public String obtenerImagen() {
        return imagen.mostrarPista();
    }
}

