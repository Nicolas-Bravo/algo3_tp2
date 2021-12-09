package edu.fiuba.algo3.modelo;

public class RangoInvestigador implements Rango{

    @Override
    public int calcularTiempoPorDistancia(int distancia) {
        return Math.round(distancia / 1300);
    }
}
