package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public interface Rango {

    int cantidadDeArrestos();

    void demoraPorDistancia(double distancia, Reloj reloj);

    Rango sumarArresto();
}
