package edu.fiuba.algo3.modelo;

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

    public void coincideCon(String[] pistas, ArrayList<Sospechoso> sospechososPosibles) {
        if(descripcion.containsAll(List.of(pistas))){
            sospechososPosibles.add(this);
        }
    }
    public boolean coincideCon (String nombre) {
        return nombre.equals(this.nombre);
    }

    public boolean coincideCon(Sospechoso sospechoso) {
        return this.descripcion.containsAll(sospechoso.descripcion);
    }

    @Override
    public boolean equals(Object sospechoso) {
        return this.coincideCon((Sospechoso)sospechoso);
    }
}

