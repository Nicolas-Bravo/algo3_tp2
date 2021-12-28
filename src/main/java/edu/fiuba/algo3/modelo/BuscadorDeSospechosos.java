package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivoSospechosos;
import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import edu.fiuba.algo3.modelo.pista.Pista;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BuscadorDeSospechosos {
    private static ArrayList<Sospechoso> listaSospechosos = LectorArchivoSospechosos.generarListaSospechososTotales();

    public static ArrayList<Sospechoso> buscarSospechosos(Pista... pistas) throws DescripcionIngresadaErroneaError {
        ArrayList<Sospechoso> sospechososPosibles = new ArrayList<>();

        for (Sospechoso sospe: listaSospechosos) {
            sospe.coincideCon(pistas, sospechososPosibles);
        }
        if (sospechososPosibles.isEmpty()){
            throw new DescripcionIngresadaErroneaError();
        }
        return sospechososPosibles;
    }

    public static Sospechoso obtenerSospechosoPorNombre(String nombre) {
        Stream<Sospechoso> streamSospechoso =  listaSospechosos.stream().filter(sospechoso -> sospechoso.coincideCon(nombre));
        return streamSospechoso.findFirst().get();
    }

    public static Sospechoso buscarSospechosoAleatorio() {
        return listaSospechosos.get((int) (Math.random() * listaSospechosos.size()));
    }
}