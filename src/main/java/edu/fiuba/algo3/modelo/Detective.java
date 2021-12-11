package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Detective {
    private final String nombre;
    private Pista pista;
    private final Reloj reloj;
    private Mapa mapa;
    private int heridas;

    public Detective(String nombreParametro){
        this.nombre = nombreParametro;
        this.reloj = new Reloj();
        this.heridas = 0;
    }

    public Detective(String nombreParametro, Mapa mapa_parametro){
        this.nombre = nombreParametro;
        this.mapa = mapa_parametro;
        this.reloj = new Reloj();
        this.heridas = 0;
    }

    public void entrar(Edificio edificio) {
        this.pista = edificio.entrar(reloj);
    }

    public Pista mostrarPista() {
        return this.pista;
    }

    public Destino destinoActual(){
        return this.mapa.destinoActual();
    }

    public void viajar(Destino destino) {
        this.reloj.aumentarHoras(this.mapa.viajar(destino)/900);
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


    public void recibirBalazo() {
        this.reloj.aumentarHoras(4);
    }

    public String fechaActual() {
        return this.reloj.fechaActual();
    }

    public void buscarEnComputadora(String... parametros) {
        ArrayList<String> sospechosos;
        sospechosos = Interpol.buscarSospechosos(parametros);

        for(String sospechoso:sospechosos){
            System.out.println(sospechoso);
        }
    }
}
