package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sospechoso {

    private final ArrayList<Pista>descripcion;
    private final String nombre;

    public Sospechoso(Pista... pistas){

        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, pistas);

        this.nombre = this.descripcion.get(0).mostrarPista();

    }

    public void coincideCon(Pista[] pistas, ArrayList<Sospechoso> sospechososPosibles) {
        if(descripcion.containsAll(List.of(pistas))){
            sospechososPosibles.add(this);
        }
    }
    public boolean coincideCon(String nombre) {
        return nombre.equals(this.nombre);
    }

    public boolean coincideCon(Sospechoso sospechoso) {
        return this.descripcion.containsAll(sospechoso.descripcion);
    }
    public ArrayList<Pista> datosSospechoso() {return this.descripcion;}
    public String nombreDelSospechoso(){return this.nombre;}

    //@Override
    //public boolean equals(Object sospechoso) {
    //    return this.coincideCon((Sospechoso)sospechoso);
    //}

}

