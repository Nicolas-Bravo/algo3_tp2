package edu.fiuba.algo3.modelo.reloj;

import edu.fiuba.algo3.modelo.reloj.Dia;
import edu.fiuba.algo3.modelo.reloj.Sabado;

public class Viernes implements Dia {
    private int hora;

    public Viernes(int hora_p) {
        this.hora = hora_p;
    }

    @Override
    public Dia aumentarHoras(int horas_p) {
        if (this.hora + horas_p > 23){
            Dia aux = new Sabado(8);
            return aux.aumentarHoras(horas_p-(24-this.hora));
        }
        this.hora += horas_p;
        return this;
    }

    @Override
    public String fechaActual() {
        return ("Viernes , "+this.hora+":00");
    }
}
