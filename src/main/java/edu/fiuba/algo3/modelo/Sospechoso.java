package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sospechoso {

    private final List<String>descripcion;
    private final String nombre;


    public Sospechoso(String datos){
        this.descripcion = Arrays.asList(datos.split(","));
        this.nombre = this.descripcion.get(0);

    }

    public void contiene(String [] datos, ArrayList<String> nombres ){
        if(descripcion.containsAll(List.of(datos))){
            nombres.add(nombre);
        }

    }
}

