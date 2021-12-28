package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.Pista;
import edu.fiuba.algo3.modelo.valor.Valor;

import java.util.ArrayList;

public class DestinoCandidato {

    private ArrayList<ArrayList> descripcion;
    private Pista nombre;

    public DestinoCandidato(ArrayList<ArrayList> matriz) {
        this.descripcion = matriz;
        this.nombre = (Pista) matriz.get(0).get(0);
    }

    public Pista obtenerNombre() {
        return this.nombre;
    }

    public Edificio[] obtenerEdificios(Valor valor_p) {
       return valor_p.obtenerEdificios(this.descripcion);
    }
}
