package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.Pista;

import java.util.ArrayList;
import java.util.Collections;

public class DestinoCandidato {

    private ArrayList<Pista> descripcion;
    private CreadorEdificios creador;

    public DestinoCandidato(Pista... descripcion_p) {
        this.descripcion = new ArrayList<>();
        Collections.addAll(this.descripcion, descripcion_p);
        this.creador = new CreadorEdificios();
    }

    public Pista obtenerNombre() {
        return descripcion.get(0);
    }

    public Edificio[] obtenerEdificios() {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];

        for(int i = 0; i < 3; i++){
            edificiosArray[i] = this.creador.obtenerEdificio(descripcion.get((int) (Math.random() * descripcion.size())));
        }
        return edificiosArray;
    }
}
