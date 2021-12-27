package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class DestinoCandidato {

    private ArrayList<Pista> descripcion;

    public DestinoCandidato(Pista... descripcion_p) {
        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, descripcion_p);
    }
}
