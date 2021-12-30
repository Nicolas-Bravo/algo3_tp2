package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.valor.Valor;

public class Tesoro {

    private final Pista nombre;
    private final Pista inicio;
    private final Valor valor;

    public Tesoro(Pista nombre_p, Pista inicio_p, Valor valor_p) {
        this.nombre = nombre_p;
        this.inicio = inicio_p;
        this.valor = valor_p;
    }

    public Pista obtenerInicio() {
        return this.inicio;
    }

    public Valor obtenerValor() { return this.valor;
    }

    public int obtenerLargoRuta() {
        return this.valor.obtenerLargoRuta();
    }
    public Tesoro(String nombre) {
        this.nombre = nombre;
        //this = BuscadorDeTesoros.obtenerTesoroPorNombre(nombre);
    }
    public boolean coincideCon(String nombre) {
        return nombre.equals(this.nombre);
    }
}
