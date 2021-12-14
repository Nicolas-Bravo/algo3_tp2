package edu.fiuba.algo3.modelo;

public class Sargento implements Rango {
    private int arrestos;

    public Sargento(){
        this.arrestos = 20;
    }
    @Override
    public int calcularDemoraPorDistancia(int distancia) {
        return distancia/1500;
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}

}

