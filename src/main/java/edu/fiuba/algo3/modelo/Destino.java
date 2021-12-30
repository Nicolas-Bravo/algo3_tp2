package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;
import java.util.Collections;

public class Destino {
    private final String nombre;
    private ArrayList<Edificio> edificios;
    private final Coordenadas cordenadas;
    private ArrayList<Destino> posibles;

    public Destino(String nombre_p, Coordenadas coordenadas_p, Edificio... edificios_p){
        this.nombre = nombre_p;
        this.cordenadas = coordenadas_p;

        this.edificios = new ArrayList<>();

        Collections.addAll(this.edificios, edificios_p);

        this.posibles = new ArrayList<>();
    }

    public Pista entrar(Reloj reloj, Edificio edificio) {
        int index = this.edificios.indexOf(edificio);
        return this.edificios.get(index).entrar(reloj);
    }

    public Coordenadas obtenerCordenadas() {
        return this.cordenadas;
    }

    public double distanciaCon(Coordenadas cordenadas_p, String unit) {
        return this.cordenadas.distanciaCon(cordenadas_p,unit);
    }

    public void agregarDestinoPosible(Destino destino) {
        this.posibles.add(destino);
    }

    public ArrayList<Destino> destinosPosibles() {
        return this.posibles;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public ArrayList<Edificio> obtenerEdificios(){
        return this.edificios;
    }

    public String enlaceImagen() {
        return "https://www.mtl.org/sites/default/files/styles/playlist_banner_big/public/2020-03/31919H.jpg?itok=TQ_3b8Bj";
    }
}
