package edu.fiuba.algo3.modelo.core;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.rangos.Rango;
import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;


public class Policia {
    private final String nombre;
    private Pista pista;
    private Reloj reloj;
    private Mapa mapa;
    private Rango rango;
    private int heridas;
    private Caso casoActual;


    public Policia(String nombre_p, Rango rango_p){
        this.nombre = nombre_p;
        this.rango = rango_p;
        this.heridas = 0;
        this.reloj = new Reloj();
    }

    public Pista entrar(Edificio edificio) {
        this.pista = this.mapa.entrar(this.reloj, edificio);
        this.casoActual.controlArresto(destinoActual(), this.pista, this);
        return this.pista;
    }

    public Pista mostrarPista() {
        return this.pista;
    }

    public Destino destinoActual(){
        return this.mapa.destinoActual();
    }

    public void viajar(Destino destino) {
        this.rango.demoraPorDistancia(this.mapa.viajar(destino), reloj);
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

    public void emitirOrdenDeArresto(Pista... datos){
        ArrayList<Sospechoso> sospechososPosibles = casoActual.buscarSospechosos(datos);
        if(sospechososPosibles.size()==1){
            this.casoActual.emitirOrden(sospechososPosibles.get(0));
        }
        this.reloj.aumentarHoras(3);
    }

    public void asignarCaso(Caso caso){
        this.casoActual = caso;
        this.mapa = casoActual.obtenerMapa();
        this.reloj = new Reloj();
    }

    public int cantidadDeArrestos() {
        return rango.cantidadDeArrestos();
    }

    public void sumarArresto() {
        this.rango = this.rango.sumarArresto();
    }

    public Rango obtenerRango() {
        return this.rango;
    }

    public String enlaceCapitalActual() {

        return mapa.enlaceCapitalActual();
    }

    public Mapa mapaActual() {
        return mapa;
    }

    public String titulo() {
        return rango.obtenerTitulo() + " " + this.nombre;
    }

    public void sumarArrestos(int cantidad) {
        for(int i=0;i<=cantidad;i++){
            rango.sumarArresto();
        }
    }
}
