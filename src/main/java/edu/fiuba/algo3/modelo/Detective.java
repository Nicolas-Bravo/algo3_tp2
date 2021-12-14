package edu.fiuba.algo3.modelo;

public class Detective implements Rango {

    private int arrestos;

    public Detective(){
        this.arrestos = 5;
    }

    @Override
    public int calcularDemoraPorDistancia(double distancia) {
        return (int)Math.round(distancia/1100.00);
    }
    @Override
    public int cantidadDeArrestos(){return arrestos;}
    @Override
    public void sumarArresto()
    {arrestos++;}
}
