package edu.fiuba.algo3.modelo;

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
