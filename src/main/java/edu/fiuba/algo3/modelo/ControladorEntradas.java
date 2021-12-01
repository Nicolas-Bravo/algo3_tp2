package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.demorador.DemoradorPorEntradas;
import edu.fiuba.algo3.modelo.demorador.PrimerEntrada;

public class ControladorEntradas {

    private DemoradorPorEntradas demorador;

    public ControladorEntradas(){
        this.demorador = new PrimerEntrada();
    }

    public int demoraTemporal(){

        int tiempo = demorador.demoraTemporal();
        this.demorador = demorador.aumentar();

        return tiempo;
    }

}
