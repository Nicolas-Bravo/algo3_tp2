package edu.fiuba.algo3.modelo;

public class Detective implements Rango {

    private int arrestos, arrestosMaximos;

    public Detective(){
        this.arrestos = 5;
        this.arrestosMaximos = 9;
    }

    @Override
    public int demoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1100.00);
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
