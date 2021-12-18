package edu.fiuba.algo3.modelo.demorador;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class TercerEntrada implements DemoradorPorEntradas {
    public DemoradorPorEntradas demoraTemporal(Reloj reloj){
        reloj.aumentarHoras(3);
        return this;
    }
}
