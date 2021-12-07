package edu.fiuba.algo3.modelo;


public class Destino {

    private String nombre;
    private Banco banco;
    private Biblioteca biblioteca;


    public Destino( String nombre_destino){
        this.nombre = nombre_destino;
        this.banco = new Banco();
        this.biblioteca = new Biblioteca();
    }

    public void entrarBanco() {
        this.banco.entrar();
    }

    public boolean bancoMostroPista() {
        return this.banco.mostroPista();
    }

    public void entrarBiblioteca() {
        this.biblioteca.entrar();
    }

    public boolean bibliotecaMostroPista() {
        return this.biblioteca.mostroPista();
    }
}
