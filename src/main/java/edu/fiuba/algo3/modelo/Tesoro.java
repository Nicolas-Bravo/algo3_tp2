package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.valor.Valor;

public class Tesoro {

    private final Destino inicio;
    private final Valor valor;

    public Tesoro(Destino inicio_p, Valor valor_p) {
        this.inicio = inicio_p;
        this.valor  = valor_p;
    }

    public Destino obtenerInicio() {
        return inicio;
    }
}
