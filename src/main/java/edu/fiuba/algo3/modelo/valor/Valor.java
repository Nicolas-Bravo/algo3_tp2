package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;

public interface Valor {
    int obtenerLargoRuta();

    Edificio[] obtenerEdificiosConSospechoso(ArrayList<ArrayList> descripcion, Pista pista);

    Edificio[] obtenerEdificios(ArrayList<ArrayList> descripcion);
}
