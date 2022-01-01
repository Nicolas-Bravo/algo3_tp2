package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.Biblioteca;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaBiblioteca;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sospechoso {

    private final ArrayList<Pista>descripcion;
    private final String nombre;

    public Sospechoso(Pista... pistas){
        this.nombre = pistas[0].mostrarPista();
        this.descripcion = new ArrayList<>();

        depurarPistas(pistas);

        Collections.addAll(this.descripcion, pistas);

    }

    private void depurarPistas(Pista[] pistas) {
        for (int i = 0; i < pistas.length; i++) {
            String[] pistaCortada = pistas[i].mostrarPista().split(" ");
            Pista pistaDepurada = new PistaGeneral(pistaCortada[pistaCortada.length - 1]);
            pistas[i] = pistaDepurada;
        }
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

    public Edificio obtenerEdificioAdecuado() {
        Random random_method = new Random();
        int rand = random_method.nextInt(descripcion.size());
        if (rand == 0) rand++;
        Biblioteca biblio = new Biblioteca(new PistaBiblioteca(this.descripcion.get(rand).mostrarPista()));
        return biblio;
    }


    //@Override
    //public boolean equals(Object sospechoso) {
    //    return this.coincideCon((Sospechoso)sospechoso);
    //}

}

