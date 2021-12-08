package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.PistaEscrita;

public class Detective {
    public final String nombre;
    private PistaEscrita pista;
    private Reloj reloj;
    private Mapa mapa;
    private int heridas;

    public Detective(String nombreParametro){
        this.nombre = nombreParametro;
        this.reloj = new Reloj();
        this.heridas = 0;
    }

    public Detective(String nombreParametro, Mapa mapita){
        this.nombre = nombreParametro;
        this.mapa = mapita;
        this.reloj = new Reloj();
        this.heridas = 0;
    }

    public void entrar(Edificio edificio) {
        this.pista=edificio.entrar(reloj);
    }

    public PistaEscrita mostrarPista() {
        return this.pista;
    }

    public String fechaActual() {
        return this.reloj.fechaActual();
    }

    public Destino destinoActual(){
        return this.mapa.destinoActual();
    }

    public void viajar(Destino destino) {
        this.mapa.viajar(destino);
    }

    public void recibirCuchillada() {
        heridas ++;
        if(heridas == 1){
            this.reloj.aumentarHoras(2);
        }
        else{
            this.reloj.aumentarHoras(1);
        }
    }
}
