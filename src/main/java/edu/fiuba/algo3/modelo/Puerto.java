package edu.fiuba.algo3.modelo;

public class Puerto {
    private boolean entro;

    public Puerto(){
        this.entro = false;
    }
    public void entrar() {
        this.entro = true;
    }
    public boolean mostroPista() {
        return this.entro;
    }
}


