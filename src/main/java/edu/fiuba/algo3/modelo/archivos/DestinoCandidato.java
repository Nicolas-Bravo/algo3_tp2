package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Banco;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Pista;

import java.util.ArrayList;
import java.util.Collections;

public class DestinoCandidato {

    private ArrayList<Pista> descripcion;

    public DestinoCandidato(Pista... descripcion_p) {
        this.descripcion = new ArrayList<>();

        Collections.addAll(this.descripcion, descripcion_p);
    }

    public Edificio obtenerEconomico() {
        return new Banco(descripcion.get(2));
    }

    public Edificio obtenerPuerto() {
        return new Banco(descripcion.get(4));
    }

    public Edificio obtenerBiblioteca() {
        return new Banco(descripcion.get(6));
    }

    public Pista obtenerNombre() {
        return descripcion.get(0);
    }
}
