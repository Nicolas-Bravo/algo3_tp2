package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Destino {

    private String nombre;
    private ArrayList<Edificio> edificios;

    public Destino( String nombre_destino, Edificio edificio1, Edificio edificio2, Edificio edificio3){
        this.nombre = nombre_destino;
        this.edificios = new ArrayList<Edificio>();
        edificios.add(edificio1);
        edificios.add(edificio2);
        edificios.add(edificio3);
    }

    public int entrarAEdificio(int index){
        return edificios.get(index-1).entrar();
    }

}
