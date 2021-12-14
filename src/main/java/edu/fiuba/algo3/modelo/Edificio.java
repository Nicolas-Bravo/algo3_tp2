package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class Edificio {

    protected final Pista pista;
    private final ControladorEntradas controlador;

    public Edificio(Pista entrada){
        this.pista = entrada;
        this.controlador = new ControladorEntradas();
    }
    protected Edificio(){
        this.controlador = new ControladorEntradas();
        this.pista = new Pista("");
    }
    public Pista entrar(Reloj reloj) {
        reloj.aumentarHoras(controlador.demoraTemporal());
        return this.pista;
    }

}

