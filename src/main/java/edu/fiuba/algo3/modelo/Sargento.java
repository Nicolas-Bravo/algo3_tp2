package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class Sargento implements Rango {
    private int arrestos;

    public Sargento(){
        this.arrestos = 20;
    }
    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1500.00) );
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public Rango sumarArresto() {
        arrestos++;
        return this;
    }

}

