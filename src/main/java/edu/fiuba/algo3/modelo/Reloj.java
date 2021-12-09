package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;

public class Reloj {

    private final String[] dias;
    private int index_dia;
    private int hora;

    public Reloj(){
        this.dias = new String[] {"Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
                "Sabado",
                "Domingo"};
        this.index_dia = 0;
        this.hora = 7;
    }

    public void aumentarHoras(int horas_aumentar) throws TiempoAgotadoException {

        int total = this.hora + horas_aumentar;

        while(total > 23){
            total -= 24;
            this.index_dia++;
        }

        if(index_dia > 7 || total > 17){
            throw new TiempoAgotadoException();
        }

        this.hora = total;
    }

    public boolean esDia(String dia_entrada){
        return (this.dias[this.index_dia]).equals(dia_entrada);
    }

    public boolean esHora(int hora_entrada){
        return (this.hora == hora_entrada);
    }

    public String fechaActual(){
        return (this.dias[this.index_dia]+" , "+this.hora+":00");
    }
}
