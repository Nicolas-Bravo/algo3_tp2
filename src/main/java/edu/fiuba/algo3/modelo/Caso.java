package edu.fiuba.algo3.modelo;


public class Caso {

    private Detective detective;
    private Reloj reloj;
    private Mapa mapa;


    public Caso(String archivo, Detective detectiveParametro){
        this.detective = detectiveParametro;
        this.reloj = new Reloj();
        this.mapa = new Mapa(archivo);


    }


    public void entrarBanco() {
        this.reloj.aumentarHoras(this.mapa.entrarBanco());
    }
    public boolean bancoMostroPista() {
        return this.mapa.bancoMostroPista();
    }

    public void entrarAeropuerto(){

        this.reloj.aumentarHoras(this.mapa.entrarAeropuerto());
    }
    public boolean aeropuertoMostroPista() {
        return this.mapa.aeropuertoMostroPista();
    }

    public void entrarBiblioteca() {

        this.reloj.aumentarHoras(this.mapa.entrarBiblioteca());
    }
    public boolean bibliotecaMostroPista(){
        return this.mapa.bibliotecaMostroPista();
    }

    public void entrarPuerto(){

        this.reloj.aumentarHoras(this.mapa.entrarPuerto());
    }
    public boolean puertoMostroPista(){
        return this.mapa.puertoMostroPista();
    }

    public void viajarAMexico() {
        this.reloj.aumentarHoras(this.mapa.viajarMexico());
    }
    public String nombreDestinoActual(){
        return this.mapa.getNombre();
    }

    public boolean esHora(int hora){
       return this.reloj.esHora(hora);
    }

    public void recibirCuchillada() {
        this.reloj.aumentarHoras(this.detective.recibirCuchillada());
    }
}