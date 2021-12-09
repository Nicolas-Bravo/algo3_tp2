package edu.fiuba.algo3.modelo;

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

