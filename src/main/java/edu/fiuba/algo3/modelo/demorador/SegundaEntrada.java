package edu.fiuba.algo3.modelo.demorador;

public class SegundaEntrada implements DemoradorPorEntradas {

    public int demoraTemporal(){
        return 2;
    }

    public DemoradorPorEntradas aumentar(){
        return new TercerEntrada();
    }
}
