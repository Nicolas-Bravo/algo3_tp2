package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Pista;

import java.util.ArrayList;
import java.util.Collections;

public class TesoroCandidato {

    private ArrayList<Pista> descripcion;

    public TesoroCandidato(Pista... descripcion_p) {
        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, descripcion_p);
    }

    public Pista obtenerInicio(){
        return descripcion.get(2);
    }


}
