package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.Pista;

public class Edificio {

    private final Pista pista;
    private final ControladorEntradas controlador;

    public Edificio( Pista entrada){
        this.pista = entrada;
        this.controlador = new ControladorEntradas();
    }

    public int entrar() {
        this.pista.mostrarPista();
        return this.controlador.demoraTemporal();
    }
}
