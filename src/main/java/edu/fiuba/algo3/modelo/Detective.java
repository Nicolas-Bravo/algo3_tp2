package edu.fiuba.algo3.modelo;

public class Detective implements Rango {

    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1100.00);
    }
}
