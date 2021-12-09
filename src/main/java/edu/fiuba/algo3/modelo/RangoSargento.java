package edu.fiuba.algo3.modelo;

public class RangoSargento implements Rango{

    @Override
    public int calcularTiempoPorDistancia(int distancia) {
        return Math.round(distancia / 1500);
    }
}
