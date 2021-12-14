package edu.fiuba.algo3.modelo;

public class Sargento implements Rango {
    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1500.00);
    }
}
