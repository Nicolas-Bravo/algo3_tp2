package edu.fiuba.algo3.modelo;

public class Banco {

    private boolean entro;

    public Banco(){
        this.entro = false;
    }

    public void entrar() {
        this.entro = true;
    }

    public boolean mostroPista() {
        return this.entro;
    }
}
