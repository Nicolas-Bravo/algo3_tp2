package edu.fiuba.algo3.modelo;

public class Tesoro {
    private String nombre;
    private Destino destino;
    private int valor;


    public Tesoro(String nombre, Destino destino, int valor) {
        this.nombre = nombre;
        this.destino = destino;
        this.valor = valor;
    }

    public Tesoro(String nombre) {
        this.nombre = nombre;
        //this = BuscadorDeTesoros.obtenerTesoroPorNombre(nombre);
    }

    public boolean coincideCon(String nombre) {
        return nombre.equals(this.nombre);
    }
}
