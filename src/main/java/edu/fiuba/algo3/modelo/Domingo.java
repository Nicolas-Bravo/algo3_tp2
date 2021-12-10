package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;

public class Domingo implements Dia {
    private int hora;

    public Domingo(int hora_p) {
        this.hora = hora_p;
    }

    @Override
    public Dia aumentarHoras(int horas_p) throws TiempoAgotadoException {
        if (this.hora + horas_p > 17){
            throw new TiempoAgotadoException();
        }
        this.hora += horas_p;
        return this;
    }

    @Override
    public String fechaActual() {
        return ("Domingo , "+this.hora+":00");
    }
}
