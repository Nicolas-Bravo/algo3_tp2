package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.PistaEscrita;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DetectiveTest {

    @Test
    public void detectiveEntraAlBancoYMuestraPista(){
        Detective detective = new Detective("Alberto");
        PistaEscrita aux = new PistaEscrita("La moneda es el peso mexicano"); //Por archivos
        Banco banco = new Banco(aux);

        detective.entrar(banco);

        assertEquals(aux , detective.mostrarPista());
    }

    @Test
    public void detectiveEntraAlBancoYMuestraPistaYEntraBiblioYMuestraPista(){
        Detective detective = new Detective("Tomas");
        PistaEscrita aux = new PistaEscrita("La moneda es el peso mexicano"); //Por archivos
        PistaEscrita aux_2 = new PistaEscrita("Son descendientes de los aztecas");
        Banco banco = new Banco(aux);
        Biblioteca biblioteca = new Biblioteca(aux_2);

        detective.entrar(banco);
        assertEquals(aux , detective.mostrarPista());

        detective.entrar(biblioteca);
        assertEquals(aux_2 , detective.mostrarPista());

    }

    @Test
    public void detectiveNovatoViajaDeMontrealAMexico(){
        Destino montreal = new Destino("Montreal");
        Destino mexico = new Destino("Mexico");
        ArrayList<Destino> destinos = new ArrayList<Destino>();
        destinos.add(montreal);
        destinos.add(mexico);

        Mapa map = new Mapa(destinos);
        Detective detective = new Detective("Jesus", map);

        detective.viajar(mexico);

        assertEquals(mexico,detective.destinoActual());

    }

    @Test
    public void detectiveVisita3VecesAeropuertoYMuestraPistaYVisita55VecesAeropuerto(){
        Detective detective = new Detective("Mabel");
        PistaEscrita pista_aeropuerto = new PistaEscrita("Esta a una distancia de 250 km");
        PistaEscrita pista_puerto = new PistaEscrita("Verde blanco y rojo");

        Puerto puerto = new Puerto(pista_puerto);
        Aeropuerto aero = new Aeropuerto(pista_aeropuerto);

        detective.entrar(aero);
        assertEquals(pista_aeropuerto , detective.mostrarPista());
        detective.entrar(aero);
        assertEquals(pista_aeropuerto , detective.mostrarPista());
        detective.entrar(aero);
        assertEquals(pista_aeropuerto , detective.mostrarPista());

        assertThrows(TiempoAgotadoException.class,() -> {
            for(int i = 0; i<54 ; i++){
                detective.entrar(puerto);
                assertEquals(pista_puerto , detective.mostrarPista());
            }
        });

    }

    @Test
    public void DetectiveRecibeCuchilladaYDuerme(){
        Detective detective = new Detective("Milanessi");

       detective.recibirCuchillada();
       assertEquals("El dia de hoy es "+"Lunes"+" y la hora actual es 0"+9+":00"
                , detective.fechaActual());

    }
}
