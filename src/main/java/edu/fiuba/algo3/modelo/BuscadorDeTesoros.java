package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BuscadorDeTesoros {
    private static ArrayList<Tesoro> listaTesoros = LectorArchivo.obtenerTesoros();
    public static Tesoro obtenerTesoroPorNombre(String nombre) {
        Stream<Tesoro> streamSospechoso =  listaTesoros.stream().filter(tesoro -> tesoro.coincideCon(nombre));
        return streamSospechoso.findFirst().get();
    }
}
