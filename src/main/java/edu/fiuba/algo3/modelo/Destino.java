package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Destino {
    private String nombre;
    private ArrayList<Edificio> edificios;

    public Destino(String nombre_p, Edificio... edificios_p){
        this.nombre = nombre_p;

        this.edificios = new ArrayList<>();

        for (int i=0; i<edificios_p.length; i++){
            this.edificios.add(edificios_p[i]);
        }
    }

    public Pista entrar(Reloj reloj, Edificio edificio) {
        int index = this.edificios.indexOf(edificio);
        return this.edificios.get(index).entrar(reloj);
    }
}
