package edu.fiuba.algo3.modelo;

public class Caso {

   private final String nombreLadron;
    private boolean orden;

    public Caso(String nombre){
        this.nombreLadron = nombre;
        this.orden = false;
    }

    public void emitirOrden(String nombre){
        if(this.nombreLadron.equals(nombre)){
            this.orden = true;
        }
    }

    public void arresteSospechoso(Policia policia) {
        if (orden) {
            policia.sumarArresto();
        }
    }
}
