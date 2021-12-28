package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.Edificio;

import java.util.ArrayList;

public interface Valor {
    int obtenerLargoRuta();

    Edificio[] obtenerEdificios(ArrayList<ArrayList> descripcion);
}
