package edu.fiuba.algo3.modelo.reloj;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import edu.fiuba.algo3.modelo.reloj.Dia;
import edu.fiuba.algo3.modelo.reloj.Lunes;

public class Reloj {

    private Dia dia;

    public Reloj(){
        this.dia = new Lunes(7);
    }

    public void aumentarHoras(int horas_p) throws TiempoAgotadoException {

        this.dia = this.dia.aumentarHoras(horas_p);
    }

    public String fechaActual(){
        return this.dia.fechaActual();
    }

}
