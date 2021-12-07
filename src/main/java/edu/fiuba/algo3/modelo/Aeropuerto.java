package edu.fiuba.algo3.modelo;

public class Aeropuerto {
    private boolean entro;

    public Aeropuerto(){
        this.entro = false;
    }

    public void entrar() {
        this.entro = true;
    }

    public boolean mostroPista() {
        return this.entro;
    }
    }

