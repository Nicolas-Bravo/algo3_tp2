package edu.fiuba.algo3.modelo.demorador;

public class TercerEntrada implements DemoradorPorEntradas {
    public int demoraTemporal(){
        return 3;
    }

    public DemoradorPorEntradas aumentar(){
        return this;
    }
}
