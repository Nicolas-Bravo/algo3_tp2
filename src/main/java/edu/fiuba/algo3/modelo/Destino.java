package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;

public class Destino {
    private final String nombre;
    private ArrayList<Edificio> edificios;
    private final Coordenadas cordenadas;
    private ArrayList<Destino> posibles;
    private final String imagen;

    public Destino(PistaGeneral nombre_p, Coordenadas coordenadas_p, Edificio... edificios_p){
        this.nombre = nombre_p.mostrarPista();
        this.cordenadas = coordenadas_p;

        this.edificios = new ArrayList<>();

        Collections.addAll(this.edificios, edificios_p);

        this.posibles = new ArrayList<>();

        this.imagen = "https://www.mtl.org/sites/default/files/styles/playlist_banner_big/public/2020-03/31919H.jpg?itok=TQ_3b8Bj";
    }

    public Destino(PistaGeneral nombre_p, Coordenadas coordenadas_p, String imagen_p, Edificio... edificios_p){
        this.nombre = nombre_p.mostrarPista();
        this.cordenadas = coordenadas_p;

        this.edificios = new ArrayList<>();

        Collections.addAll(this.edificios, edificios_p);

        this.posibles = new ArrayList<>();

        this.imagen = imagen_p;
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

        return this.imagen;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
