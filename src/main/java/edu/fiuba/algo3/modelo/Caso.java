package edu.fiuba.algo3.modelo;

public class Caso {

   private final Sospechoso ladronActual;
    private boolean orden;

    public Caso(String nombre){
        BuscadorDeSospechosos buscadorDeSospechosos = new BuscadorDeSospechosos();
        this.ladronActual = buscadorDeSospechosos.obtenerSospechosoPorNombre(nombre);
        this.orden = false;
    }

    public void emitirOrden(Sospechoso sospechoso){
        if(this.nombreLadron.equals(sospechoso.nombre())){
            this.orden = true;
        }
    }

    public void arresteSospechoso(Policia policia) {
        if (orden) {
            policia.sumarArresto();
        }
    }
}
