package edu.fiuba.algo3.modelo.rangos;

import edu.fiuba.algo3.modelo.Tesoro;
import edu.fiuba.algo3.modelo.archivos.TesoroCandidato;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.valor.Valioso;

import java.util.ArrayList;

public class Investigador implements Rango {

    private int arrestos;
    private final int arrestosMaximos;

    public Investigador(){
        this.arrestos = 10;
        this.arrestosMaximos = 19;
    }

    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1300.00) );
    }

    @Override
    public int cantidadDeArrestos(){return arrestos;}

    @Override
    public Rango sumarArresto() {
        arrestos++;
        if (arrestos > arrestosMaximos) {
            return new Sargento();
        }
        return this;
    }

    @Override
    public Tesoro obtenerTesoroAleatorio(ArrayList<ArrayList> matriz) {
        ArrayList<TesoroCandidato> candidatos = matriz.get(1);
        TesoroCandidato elejido = candidatos.get( (int) (Math.random()*candidatos.size()) );
        return new Tesoro(elejido.obtenerNombre(), elejido.obtenerInicio(), new Valioso() );
    }
}
