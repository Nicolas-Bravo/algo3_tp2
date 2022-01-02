package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.edificios.Edificio;

public abstract class Pista {

    private String pista;

    public Pista(String entrada){
        this.pista = entrada;
    }

    public Pista(Pista pista) {
        this.pista = pista.mostrarPista();
    }

    public void sobreescribir(String entrada) {this.pista = entrada;}

    public String mostrarPista(){
        return this.pista;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Pista){
            return this.pista.equals(((Pista)o).mostrarPista());
        }
        return false;
    }

    public abstract Edificio obtenerEdificio();

}
