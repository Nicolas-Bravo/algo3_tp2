package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;
import java.util.Collections;

public class Destino {
    private String nombre;
    private ArrayList<Edificio> edificios;

    public Destino(String nombre_p, Edificio... edificios_p){
        this.nombre = nombre_p;

        this.edificios = new ArrayList<>();

        Collections.addAll(this.edificios, edificios_p);
    }

    public Pista entrar(Reloj reloj, Edificio edificio) {
        int index = this.edificios.indexOf(edificio);
        return this.edificios.get(index).entrar(reloj);
    }
}
