package edu.fiuba.algo3.modelo;


public class Destino {

    private String nombre;
    private Banco banco;
    private Biblioteca biblioteca;
    private Aeropuerto aeropuerto;
    private Puerto puerto;


    public Destino( String nombre_destino){
        this.nombre = nombre_destino;
        this.banco = new Banco();
        this.biblioteca = new Biblioteca();
        this.aeropuerto = new Aeropuerto();
        this.puerto = new Puerto();
    }

    public void entrarBanco(){
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

    public void entrarAeropuerto() {
        this.aeropuerto.entrar();
    }
    public boolean aeropuertoMostroPista() {
        return this.aeropuerto.mostroPista();
    }

    public void entrarPuerto() {
        this.puerto.entrar();
    }
    public boolean puertoMostroPista() {
        return this.puerto.mostroPista();
    }

    public String getNombre(){
        return this.nombre;
    }
}
