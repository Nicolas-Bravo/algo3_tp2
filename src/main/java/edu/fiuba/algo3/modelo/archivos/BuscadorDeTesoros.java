package edu.fiuba.algo3.modelo.archivos;

import java.util.ArrayList;

public class BuscadorDeTesoros {

    private static ArrayList<TesoroCandidato> listaTesoros = LectorArchivoTesoro.generarListaTesoroCandidato();

    public static TesoroCandidato buscarTesoroAleatorioAleatorio() {
        return listaTesoros.get((int) (Math.random() * listaTesoros.size()));
    }
}
