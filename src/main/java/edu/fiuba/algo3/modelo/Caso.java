package edu.fiuba.algo3.modelo;

public class Caso {

    Detective detective;
    String botin;
    String generoLadron;
    Destino destinoActual;

    public Caso(String botinParametro, String generoLadronParametro, String destinoInicial, Detective detectiveParametro){
        this.detective = detectiveParametro;
        this.botin = botinParametro;
        this.generoLadron = generoLadronParametro;
        this.destinoActual = new Destino(destinoInicial);
    }


    public void entrarBanco() {
        this.destinoActual.entrarBanco();
    }

    public boolean bancoMostroPista() {
        return this.destinoActual.bancoMostroPista();
    }

    public void entrarBiblioteca() {
        this.destinoActual.entrarBiblioteca();
    }
    public boolean bibliotecaMostroPista() {
        return this.destinoActual.bibliotecaMostroPista();
    }

}