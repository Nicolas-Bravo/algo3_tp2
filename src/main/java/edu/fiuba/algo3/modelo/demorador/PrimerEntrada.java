package edu.fiuba.algo3.modelo.demorador;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class PrimerEntrada implements DemoradorPorEntradas {

    public DemoradorPorEntradas demoraTemporal(Reloj reloj){
        reloj.aumentarHoras(1);
        return new SegundaEntrada();
    }

}
