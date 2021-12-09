package edu.fiuba.algo3.modelo;

public class RangoNovato implements Rango {
    @Override
    public int calcularTiempoPorDistancia(int distancia) {
        return Math.round(distancia / 900);
    }

}
