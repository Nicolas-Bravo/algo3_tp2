package edu.fiuba.algo3.modelo;

public class Investigador implements Rango {
    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/1300;
    }
}
