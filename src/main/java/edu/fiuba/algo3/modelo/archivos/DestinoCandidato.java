package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Coordenadas;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.Pista;
import edu.fiuba.algo3.modelo.valor.Valor;

import java.util.ArrayList;

public class DestinoCandidato {

    private ArrayList<ArrayList> descripcion;
    private Pista nombre;
    private Coordenadas coordenadas;

    public DestinoCandidato(ArrayList<ArrayList> matriz) {
        this.descripcion = matriz;
        this.nombre = (Pista) matriz.get(0).get(0);
        double lat = Double.parseDouble( ((Pista)(matriz.get(0).get(1))).mostrarPista() );
        double lon = Double.parseDouble( ((Pista)(matriz.get(0).get(2))).mostrarPista() );
        this.coordenadas = new Coordenadas(lat,lon);
    }

    public Pista obtenerNombre() {
        return this.nombre;
    }

    public Coordenadas obtenerCoordenadas() {return this.coordenadas;
    }

    public Edificio[] obtenerEdificios(Valor valor_p) {
       return valor_p.obtenerEdificios(this.descripcion);
    }


    public boolean coincideCon(Pista nombre_p) {
        return nombre_p.equals(this.nombre);
    }
}
