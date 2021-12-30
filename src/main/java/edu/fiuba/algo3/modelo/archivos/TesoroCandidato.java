package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;
import java.util.Collections;

public class TesoroCandidato {

    private final ArrayList<Pista> descripcion;

    public TesoroCandidato(Pista... descripcion_p) {
        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, descripcion_p);
    }

    public Pista obtenerInicio(){
        return descripcion.get(2);
    }

    public Pista obtenerNombre() {
        return descripcion.get(1);
    }
}
