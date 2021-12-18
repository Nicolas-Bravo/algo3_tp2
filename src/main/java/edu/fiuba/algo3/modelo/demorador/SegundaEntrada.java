package edu.fiuba.algo3.modelo.demorador;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class SegundaEntrada implements DemoradorPorEntradas {

    public DemoradorPorEntradas demoraTemporal(Reloj reloj){
        reloj.aumentarHoras(2);
        return new SegundaEntrada();
    }
}
