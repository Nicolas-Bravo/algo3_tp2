package edu.fiuba.algo3.modelo;

public class Novato implements Rango {
    private int arrestos;

    public Novato(){
        this.arrestos = 0;
    }

    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/900;
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
}
