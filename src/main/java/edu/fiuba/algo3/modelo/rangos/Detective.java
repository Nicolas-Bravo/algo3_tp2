package edu.fiuba.algo3.modelo.rangos;

import edu.fiuba.algo3.modelo.Tesoro;
import edu.fiuba.algo3.modelo.archivos.TesoroCandidato;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.valor.Valioso;

import java.util.ArrayList;

public class Detective implements Rango {

    private int arrestos;
    private final int arrestosMaximos;

    public Detective(){
        this.arrestos = 5;
        this.arrestosMaximos = 9;
    }

    @Override
    public void demoraPorDistancia(double distancia, Reloj reloj) {
        reloj.aumentarHoras( (int)Math.round(distancia/1100.00) );
    }

    @Override
    public int cantidadDeArrestos(){return arrestos;}

    @Override
    public Rango sumarArresto() {
        arrestos++;
        if (arrestos > arrestosMaximos) {
            return new Investigador();
        }
        return this;
    }

    @Override
    public Tesoro obtenerTesoroAleatorio(ArrayList<ArrayList> matriz) {
        ArrayList<TesoroCandidato> candidatos = matriz.get(1);
        TesoroCandidato elejido = candidatos.get( (int) (Math.random()*candidatos.size()) );
        return new Tesoro(elejido.obtenerNombre(), elejido.obtenerInicio(), new Valioso() );
    }

    @Override
    public String obtenerTitulo() {
        String clase = this.getClass().toString();
        String[] rangoDividido = clase.split("\\.");
        return rangoDividido[rangoDividido.length - 1];
    }
}
