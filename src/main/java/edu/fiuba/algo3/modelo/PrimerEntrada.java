package edu.fiuba.algo3.modelo;

public class PrimerEntrada implements DemoradorPorEntradas {

    public int demoraTemporal(){
        return 1;
    }

    public DemoradorPorEntradas aumentar(){
        return new SegundaEntrada();
    }
}
