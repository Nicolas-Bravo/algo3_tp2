package edu.fiuba.algo3.modelo.rangos;

import edu.fiuba.algo3.modelo.core.Tesoro;
import edu.fiuba.algo3.modelo.archivos.TesoroCandidato;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.valor.Comun;

import java.util.ArrayList;

public class Novato implements Rango {
    private int arrestos;
    private final int arrestosMaximos;

    public Novato(){
        this.arrestos = 0;
        this.arrestosMaximos = 4;
    }

    @Override
    public String obtenerTitulo() {
        String clase = this.getClass().toString();
        String[] rangoDividido = clase.split("\\.");
        return rangoDividido[rangoDividido.length - 1];
    }
    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/900.00) );
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

    @Override
    public Tesoro obtenerTesoroAleatorio(ArrayList<ArrayList> matriz) {
        ArrayList<TesoroCandidato> candidatos = matriz.get(0);
        TesoroCandidato elejido = candidatos.get( (int) (Math.random()*candidatos.size()) );
        return new Tesoro(elejido.obtenerNombre(), elejido.obtenerInicio(), new Comun() );
    }
}
