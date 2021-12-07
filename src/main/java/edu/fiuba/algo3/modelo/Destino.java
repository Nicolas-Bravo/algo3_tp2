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

    public int entrarBanco(){
        return this.banco.entrar();
    }
    public boolean bancoMostroPista() {
        return this.banco.mostroPista();
    }

    public int entrarBiblioteca() {
        return this.biblioteca.entrar();
    }
    public boolean bibliotecaMostroPista() {
        return this.biblioteca.mostroPista();
    }

    public int entrarAeropuerto() {
        return this.aeropuerto.entrar();
    }
    public boolean aeropuertoMostroPista() {
        return this.aeropuerto.mostroPista();
    }

    public int entrarPuerto() {
        return this.puerto.entrar();
    }
    public boolean puertoMostroPista() {
        return this.puerto.mostroPista();
    }

    public String getNombre(){
        return this.nombre;
    }
}
