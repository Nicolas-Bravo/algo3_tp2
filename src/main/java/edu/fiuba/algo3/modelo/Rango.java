package edu.fiuba.algo3.modelo;

public abstract class Rango {
    float velocidad;
    public int calcularTiempoPorDistancia(float distancia) {
        return Math.round(distancia / velocidad);
    }
}
