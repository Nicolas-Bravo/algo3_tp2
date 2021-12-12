package edu.fiuba.algo3.modelo.reloj;

import edu.fiuba.algo3.modelo.reloj.Dia;
import edu.fiuba.algo3.modelo.reloj.Domingo;

public class Sabado implements Dia {
    private int hora;

    public Sabado(int hora_p) {
        this.hora = hora_p;
    }

    @Override
    public Dia aumentarHoras(int horas_p) {
        if (this.hora + horas_p > 23){
            Dia aux = new Domingo(8);
            return aux.aumentarHoras(horas_p-(24-this.hora));
        }
        this.hora += horas_p;
        return this;
    }

    @Override
    public String fechaActual() {
        return ("Sabado , "+this.hora+":00");
    }
}
