package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.pistas.*;
import edu.fiuba.algo3.modelo.valor.Valor;

import java.util.ArrayList;

public class DestinoCandidato {

    private final ArrayList<ArrayList> descripcion;
    private final Pista nombre;
    private final Coordenadas coordenadas;
    private final String imagen;

    public DestinoCandidato(ArrayList<ArrayList> matriz) {
        this.descripcion = matriz;
        this.nombre = (Pista) matriz.get(0).get(0);
        double lat = Double.parseDouble( ((Pista)(matriz.get(0).get(1))).mostrarPista() );
        double lon = Double.parseDouble( ((Pista)(matriz.get(0).get(2))).mostrarPista() );
        this.coordenadas = new Coordenadas(lat,lon);
        this. imagen = ((Pista) matriz.get(0).get(3)).mostrarPista();
    }

    public Pista obtenerNombre() {
        return this.nombre;
    }

    public Coordenadas obtenerCoordenadas() {return this.coordenadas;
    }

    public Edificio[] obtenerEdificios(Valor valor_p, Pista pista) {
       return valor_p.obtenerEdificiosConSospechoso(this.descripcion, pista);
    }

    public Edificio[] obtenerEdificios(Valor valor_p) {
        return valor_p.obtenerEdificios(this.descripcion);
    }

    public boolean coincideCon(Pista nombre_p) {
        return nombre_p.equals(this.nombre);
    }

    public Destino generarDestinoErroneo() {

        return new Destino(new PistaGeneral(this.nombre), this.coordenadas, this.imagen,
                new Biblioteca(new PistaBiblioteca("No hemos visto a nadie por aqui")),
                new Banco(new PistaEconomica("No hemos visto a nadie por aqui")),
                new Aeropuerto(new PistaPuerto("No hemos visto a nadie por aqui")));
    }

    public String obtenerImagen() {
        return this.imagen;
    }
}
