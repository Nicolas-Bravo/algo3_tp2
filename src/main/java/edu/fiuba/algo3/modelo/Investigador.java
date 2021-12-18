package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;

public class Investigador implements Rango {

    private int arrestos, arrestosMaximos;

    public Investigador(){
        this.arrestos = 10;
        this.arrestosMaximos = 19;
    }

    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1300.00) );
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public Rango sumarArresto() {
        arrestos++;
        if (arrestos > arrestosMaximos) {
            return new Sargento();
        }
        return this;
    }
}
