package edu.fiuba.algo3.modelo;

public class Novato implements Rango {
    private int arrestos;
    private int arrestosMaximos;

    public Novato(){
        this.arrestos = 0;
        this.arrestosMaximos = 4;
    }

    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/900.00);
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
