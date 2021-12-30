package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.edificios.Aeropuerto;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.edificios.Puerto;

import java.util.Random;

public class PistaPuerto extends Pista {
    public PistaPuerto(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {

        Random random_method = new Random();
        if (random_method.nextInt(2) == 1){
            return new Aeropuerto(this);
        }
        return new Puerto(this);
    }
}
