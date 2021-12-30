package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.edificios.Banco;
import edu.fiuba.algo3.modelo.edificios.Bolsa;
import edu.fiuba.algo3.modelo.edificios.Edificio;

import java.util.Random;

public class PistaEconomica extends Pista {

    public PistaEconomica(String entrada) {
        super(entrada);
    }

    public Edificio obtenerEdificio() {

        Random random_method = new Random();
        if (random_method.nextInt(2) == 1){
            return new Bolsa(this);
        }
        return new Banco(this);
    }
}
