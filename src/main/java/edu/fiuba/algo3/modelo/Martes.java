package edu.fiuba.algo3.modelo;

public class Martes implements Dia {

    private int hora;

    public Martes(int hora_p) {
        this.hora = hora_p;
    }

    @Override
    public Dia aumentarHoras(int horas_p) {
        if (this.hora + horas_p > 23){
            Dia aux = new Miercoles(8);
            return aux.aumentarHoras(horas_p-(24-this.hora));
        }
        this.hora += horas_p;
        return this;
    }

    @Override
    public String fechaActual() {
        return ("Martes , "+this.hora+":00");
    }
}
