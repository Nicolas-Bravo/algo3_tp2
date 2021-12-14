package edu.fiuba.algo3.modelo;

public class Investigador implements Rango {

    private int arrestos;

    public Investigador(){
        this.arrestos = 10;
    }

    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/1300;
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
}
