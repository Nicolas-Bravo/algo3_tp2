package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class Novato implements Rango {
    private int arrestos;
    private int arrestosMaximos;

    public Novato(){
        this.arrestos = 0;
        this.arrestosMaximos = 4;
    }

    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/900.00) );
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public Rango sumarArresto() {
        arrestos++;
        if (arrestos > arrestosMaximos) {
            return new Detective();
        }
        return this;
    }
}
