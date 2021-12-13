package edu.fiuba.algo3.modelo;

public class Sargento implements Rango {
    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/1500;
    }
}
