package edu.fiuba.algo3.modelo;

public class Biblioteca {

    private boolean entro;

    public Biblioteca(){
        this.entro = false;
    }

    public void entrar() {
        this.entro = true;
    }

    public boolean mostroPista() {
        return this.entro;
    }
}
