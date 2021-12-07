package edu.fiuba.algo3.modelo;

public class Banco {
    private final ControladorEntradas controlador;
    private boolean entro;

    public Banco(){
        this.entro = false;
        this.controlador = new ControladorEntradas();
    }

    public int entrar() {
        this.entro = true;
        return this.controlador.demoraTemporal();
    }

    public boolean mostroPista() {
        return this.entro;
    }
}
