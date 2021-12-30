package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivoTesoro;
import edu.fiuba.algo3.modelo.rangos.Rango;

import java.util.ArrayList;

public class BuscadorDeTesoros {

    private static final ArrayList<ArrayList> Matriz = LectorArchivoTesoro.generarListaTesoroCandidato();

    public static Tesoro obtenerTesoroAleatorioAleatorio(Rango rango) {
        return rango.obtenerTesoroAleatorio(Matriz);
    }
}

    public static Tesoro obtenerTesoroPorNombre(String nombre) {
        Stream<Tesoro> streamSospechoso =  listaTesoros.stream().filter(tesoro -> tesoro.coincideCon(nombre));
        return streamSospechoso.findFirst().get();
    }
}
