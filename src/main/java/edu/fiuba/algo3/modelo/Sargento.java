package edu.fiuba.algo3.modelo;

public class Sargento implements Rango {
    private int arrestos;

    public Sargento(){
        this.arrestos = 20;
    }
    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1500.00);
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}

}

