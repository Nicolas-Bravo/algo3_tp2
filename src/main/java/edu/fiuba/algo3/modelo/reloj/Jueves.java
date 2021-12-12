package edu.fiuba.algo3.modelo.reloj;

public class Jueves implements Dia {
    private int hora;

    public Jueves(int hora_p) {
        this.hora = hora_p;
    }

    @Override
    public Dia aumentarHoras(int horas_p) {
        if (this.hora + horas_p > 23){
            Dia aux = new Viernes(8);
            return aux.aumentarHoras(horas_p-(24-this.hora));
        }
        this.hora += horas_p;
        return this;
    }

    @Override
    public String fechaActual() {
        return ("Jueves , "+this.hora+":00");
    }
}
