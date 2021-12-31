package edu.fiuba.algo3.modelo.rangos;

import edu.fiuba.algo3.modelo.Tesoro;
import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;

public interface Rango {

    int cantidadDeArrestos();

    void demoraPorDistancia(double distancia, Reloj reloj);

    Rango sumarArresto();

    Tesoro obtenerTesoroAleatorio(ArrayList<ArrayList> matriz);

    String obtenerTitulo();
}
