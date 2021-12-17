package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class BuscadorDeSospechosos {
    ArrayList<Sospechoso> listaSospechosos;

    public BuscadorDeSospechosos() {
        listaSospechosos = LectorArchivo.generarListaSospechososTotales();
    }



    public ArrayList<Sospechoso> buscarSospechosos(String... pistas)throws DescripcionIngresadaErroneaError {
        ArrayList<Sospechoso> sospechososPosibles = new ArrayList<>();

        for (Sospechoso sospe: this.listaSospechosos) {
            if (sospe.coincideCon(pistas)) {
                sospechososPosibles.add(sospe);
            }
        }
        if (sospechososPosibles.isEmpty()){
            throw new DescripcionIngresadaErroneaError();
        }
        return sospechososPosibles;
    }

    public Sospechoso obtenerSospechosoPorNombre(String nombre) {
        Sospechoso sospechosoDevolver = listaSospechosos.;


        int i = 0;
        boolean seguirBuscando = true;
        Sospechoso sospechosoDevolver;
        this.listaSospechosos.
        while (i < this.listaSospechosos.size() && seguirBuscando) {
            Sospechoso sospechosoActual = listaSospechosos.get(i);
            if (sospechosoActual.nombre() == nombre) {
                seguirBuscando = false;
                sospechosoDevolver = sospechosoActual;
            }
        }
        return sospechosoDevolver;
    }
}
