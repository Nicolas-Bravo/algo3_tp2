package edu.fiuba.algo3.modelo;

public class Detective implements Rango {

    private int arrestos;

    public Detective(){
        this.arrestos = 5;
    }

    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/1100;
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
}
