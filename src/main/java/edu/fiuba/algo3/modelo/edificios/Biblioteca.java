package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.pistas.PistaBiblioteca;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

public class Biblioteca extends Edificio {
    private final PistaGeneral imagen;

    public Biblioteca(PistaBiblioteca entrada) {
        super(entrada);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/1596/1596392.png");
    }

    public Biblioteca(PistaGeneral entrada){
        super(entrada);
        this.imagen = new PistaGeneral("https://cdn-icons-png.flaticon.com/64/1596/1596392.png");

    }

    @Override
    public String obtenerImagen() {
        return imagen.mostrarPista();
    }
}
