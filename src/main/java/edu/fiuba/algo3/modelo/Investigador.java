package edu.fiuba.algo3.modelo;

public class Investigador implements Rango {
    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1300.00);
    }
}
