package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.IntentoDeArrestoExecption;
import edu.fiuba.algo3.modelo.reloj.Reloj;

import java.util.ArrayList;


public class Policia {
    private final String nombre;
    private Pista pista;
    private final Reloj reloj;
    private Mapa mapa;
    private Rango rango;
    private int heridas;
    private Caso casoActual;


    public Policia(String nombre_p, Rango rango_p, Mapa mapa_p){
        this.nombre = nombre_p;
        this.reloj = new Reloj();
        this.mapa = mapa_p;
        this.rango = rango_p;
        this.heridas = 0;
    }

    public void entrar(Edificio edificio) {
        try{
            this.pista = this.mapa.entrar(this.reloj, edificio);
        }catch (IntentoDeArrestoExecption e) {
            this.casoActual.arresteSospechoso(this);
        }
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

    public void emitirOrdenDeArresto(String... datos){
        ArrayList<Sospechoso> sospechososPosibles = casoActual.buscarSospechosos(datos);
        if(sospechososPosibles.size()==1){
            this.casoActual.emitirOrden(sospechososPosibles.get(0));
        }
    }

    public void asignarCaso(Caso caso){
        this.casoActual = caso;
    }

    public int cantidadDeArrestos() {
        return rango.cantidadDeArrestos();
    }

    public void sumarArresto() {
        this.rango = this.rango.sumarArresto();
    }
}
