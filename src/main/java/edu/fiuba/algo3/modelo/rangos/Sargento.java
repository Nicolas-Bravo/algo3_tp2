package edu.fiuba.algo3.modelo.rangos;

import edu.fiuba.algo3.modelo.Tesoro;
import edu.fiuba.algo3.modelo.archivos.TesoroCandidato;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.valor.MuyValioso;

import java.util.ArrayList;

public class Sargento implements Rango {
    private int arrestos;

    public Sargento(){
        this.arrestos = 20;
    }
    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1500.00) );
    }

    @Override
    public int cantidadDeArrestos(){return arrestos;}

    @Override
    public Rango sumarArresto() {
        arrestos++;
        return this;
    }

    @Override
    public Tesoro obtenerTesoroAleatorio(ArrayList<ArrayList> matriz) {
        ArrayList<TesoroCandidato> candidatos = matriz.get(2);
        TesoroCandidato elejido = candidatos.get( (int) (Math.random()*candidatos.size()) );
        return new Tesoro(elejido.obtenerNombre(), elejido.obtenerInicio(), new MuyValioso() );
    }

}

