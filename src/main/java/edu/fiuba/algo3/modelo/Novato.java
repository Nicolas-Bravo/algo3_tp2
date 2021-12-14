package edu.fiuba.algo3.modelo;

public class Novato implements Rango {

    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/900.00);
    }
}
