package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivoTesoro;
import edu.fiuba.algo3.modelo.rango.Rango;

import java.util.ArrayList;

public class BuscadorDeTesoros {

    private static ArrayList<ArrayList> Matriz = LectorArchivoTesoro.generarListaTesoroCandidato();

    public static Tesoro obtenerTesoroAleatorioAleatorio(Rango rango) {
        return rango.obtenerTesoroAleatorio(Matriz);
    }
}
