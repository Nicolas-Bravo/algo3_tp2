package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivo;
import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.util.ArrayList;
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
