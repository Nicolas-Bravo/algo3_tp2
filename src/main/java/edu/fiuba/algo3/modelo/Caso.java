package edu.fiuba.algo3.modelo;

public class Caso {

    Detective detective;
    String botin;
    String generoLadron;
    Destino destinoActual;
    Reloj reloj;

    public Caso(String botinParametro, String generoLadronParametro, String destinoInicial, Detective detectiveParametro){
        this.detective = detectiveParametro;
        this.botin = botinParametro;
        this.generoLadron = generoLadronParametro;
        this.destinoActual = new Destino(destinoInicial);
        this.reloj = new Reloj();
    }


    public void entrarBanco() {
        this.reloj.aumentarHoras(this.destinoActual.entrarBanco());
    }
    public boolean bancoMostroPista() {
        return this.destinoActual.bancoMostroPista();
    }

    public void entrarAeropuerto(){

        this.reloj.aumentarHoras(this.destinoActual.entrarAeropuerto());
    }
    public boolean aeropuertoMostroPista() {
        return this.destinoActual.aeropuertoMostroPista();
    }

    public void entrarBiblioteca() {

        this.reloj.aumentarHoras(this.destinoActual.entrarBiblioteca());
    }
    public boolean bibliotecaMostroPista(){
        return this.destinoActual.bibliotecaMostroPista();
    }

    public void entrarPuerto(){

        this.reloj.aumentarHoras(this.destinoActual.entrarPuerto());
    }
    public boolean puertoMostroPista(){
        return this.destinoActual.puertoMostroPista();
    }

    public void viajarAMexico() {

        this.destinoActual = new Destino("Mexico");
        this.reloj.aumentarHoras(5);
    }
    public String nombreDestinoActual(){
        return this.destinoActual.getNombre();
    }

    public boolean esHora(int hora){
       return this.reloj.esHora(hora);
    }

    public void recibirCuchillada() {
        this.reloj.aumentarHoras(this.detective.recibirCuchillada());
    }
}