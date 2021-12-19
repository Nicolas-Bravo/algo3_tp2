package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Stream;

public class BuscadorDeSospechosos {

    public static ArrayList<Sospechoso> buscarSospechosos( ArrayList<Sospechoso> listaSospechosos, Pista... pistas) throws DescripcionIngresadaErroneaError {
        ArrayList<Sospechoso> sospechososPosibles = new ArrayList<>();

        for (Sospechoso sospe: listaSospechosos) {
            sospe.coincideCon(pistas, sospechososPosibles);
        }
        if (sospechososPosibles.isEmpty()){
            throw new DescripcionIngresadaErroneaError();
        }
        return sospechososPosibles;
    }

    public static Sospechoso obtenerSospechosoPorNombre(String nombre, ArrayList<Sospechoso> listaSospechosos) {
        Stream<Sospechoso> streamSospechoso =  listaSospechosos.stream().filter(sospechoso -> sospechoso.coincideCon(nombre));
        return streamSospechoso.findFirst().get();
    }

    public static ArrayList<Sospechoso> obtenerTodosLosSospechosos() {
        return LectorArchivo.generarListaSospechososTotales();
    }
}
