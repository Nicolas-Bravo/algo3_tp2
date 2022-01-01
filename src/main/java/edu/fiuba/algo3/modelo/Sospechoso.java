package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sospechoso {

    private final ArrayList<Pista> descripcion;
    private final ArrayList<Pista> datos;
    private final String nombre;

    public Sospechoso(Pista... pistas){
        this.descripcion = new ArrayList<>();
        Collections.addAll(this.descripcion, pistas);

        this.datos = depurarPistas(pistas);

        this.nombre = descripcion.get(0).mostrarPista();
    }

    public void coincideCon(Pista[] pistas, ArrayList<Sospechoso> sospechososPosibles) {
        if(this.datos.containsAll(List.of(pistas))){
            sospechososPosibles.add(this);
        }
    }
    public boolean coincideCon(String nombre) {
        return nombre.equals(this.nombre);
    }

    public boolean coincideCon(Sospechoso sospechoso) {
        return this.datos.containsAll(sospechoso.datosSospechoso());
    }

    public ArrayList<Pista> datosSospechoso() {return this.datos;}

    public ArrayList<Pista> descripcionSospechoso() {
        return this.descripcion;
    }

    public String nombreDelSospechoso(){return this.nombre;}

    private ArrayList<Pista> depurarPistas(Pista[] pistas) {

        ArrayList<Pista> datos = new ArrayList<>();
        datos.add(pistas[0]);

        for (int i = 1; i < pistas.length; i++) {
            String[] pistaCortada = pistas[i].mostrarPista().split(" ");
            Pista pistaDepurada = new PistaGeneral(pistaCortada[pistaCortada.length - 1]);
            datos.add(pistaDepurada);
        }


        return datos;
    }
    public String obtenerGenero() {
        return this.descripcion.get(1).mostrarPista();
    }
}
