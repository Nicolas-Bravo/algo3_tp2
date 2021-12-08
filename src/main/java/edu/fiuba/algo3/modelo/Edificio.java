package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.Pista;
import edu.fiuba.algo3.modelo.pista.PistaEscrita;

public  abstract class Edificio {

    protected final PistaEscrita pista;
    private final ControladorEntradas controlador;

    public Edificio(PistaEscrita entrada){
        this.pista = entrada;
        this.controlador = new ControladorEntradas();
    }

    public PistaEscrita entrar(Reloj watch) {
        watch.aumentarHoras(controlador.demoraTemporal());
        return this.pista;
    }

}
