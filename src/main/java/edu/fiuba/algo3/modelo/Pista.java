package edu.fiuba.algo3.modelo;

public class Pista {

    private final String pista;

    public Pista(String entrada){
        this.pista = entrada;
    }

    public String mostrarPista(){
        return this.pista;
    }

    @Override
    public boolean equals(Object o){
        return this.pista.equals(((Pista)o).mostrarPista());
    }

}
