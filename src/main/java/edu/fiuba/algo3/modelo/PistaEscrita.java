package edu.fiuba.algo3.modelo;

public class PistaEscrita implements Pista {

    private final String pista;

    public PistaEscrita(String entrada){
        this.pista = entrada;
    }

    public void mostrarPista(){
        System.out.println(this.pista);
    }
}
