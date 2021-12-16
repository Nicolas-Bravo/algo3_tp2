package edu.fiuba.algo3.modelo;

public class Novato implements Rango {
    private int arrestos;

    public Novato(){
        this.arrestos = 0;
    }

    @Override
    public int demoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/900.00);
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public void sumarArresto()
    {arrestos++;}
}
