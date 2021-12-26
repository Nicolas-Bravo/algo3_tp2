package edu.fiuba.algo3.modelo.rango;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class Detective implements Rango {

    private int arrestos;
    private final int arrestosMaximos;

    public Detective(){
        this.arrestos = 5;
        this.arrestosMaximos = 9;
    }

    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1100.00) );
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public Rango sumarArresto() {
        arrestos++;
        if (arrestos > arrestosMaximos) {
            return new Investigador();
        }
        return this;
    }

}
