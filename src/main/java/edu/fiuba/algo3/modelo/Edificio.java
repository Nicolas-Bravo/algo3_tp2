package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public abstract class Edificio {

    protected final Pista pista;
    private final ControladorEntradas controlador;

    public Edificio(Pista entrada){
        this.pista = entrada;
        this.controlador = new ControladorEntradas();
    }

    public Pista entrar(Reloj reloj) {
        reloj.aumentarHoras(controlador.demoraTemporal());
        return this.pista;
    }

}

