package edu.fiuba.algo3.modelo.pista;

import edu.fiuba.algo3.modelo.Edificio;

public class Pista {

    private String pista;

    public Pista(String entrada){
        this.pista = entrada;
    }

    public void sobreescribir(String entrada) {this.pista = entrada;}

    public String mostrarPista(){
        return this.pista;
    }

    @Override
    public boolean equals(Object o){
        return this.pista.equals(((Pista)o).mostrarPista());
    }

    public Edificio obtenerEdificio(){
        return new Edificio(this);
    }
}
