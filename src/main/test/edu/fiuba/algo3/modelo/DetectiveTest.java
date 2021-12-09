package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import static org.junit.jupiter.api.Assertions.*;

public class DetectiveTest {

    @Test
    public void detectiveEntraAlBancoYMuestraPista(){
        Detective detective = new Detective("Alberto");
        Pista aux = new Pista("La moneda es el peso mexicano"); //Por archivos
        Banco banco = new Banco(aux);

        detective.entrar(banco);

        assertEquals(aux , detective.mostrarPista());
    }

    @Test
    public void detectiveEntraAlBancoYMuestraPistaYEntraBiblioYMuestraPista(){
        Detective detective = new Detective("Tomas");
        Pista aux = new Pista("La moneda es el peso mexicano"); //Por archivos
        Pista aux_2 = new Pista("Son descendientes de los aztecas");
        Banco banco = new Banco(aux);
        Biblioteca biblioteca = new Biblioteca(aux_2);

        detective.entrar(banco);
        assertEquals(aux , detective.mostrarPista());

        detective.entrar(biblioteca);
        assertEquals(aux_2 , detective.mostrarPista());

    }

    @Test
    public void detectiveNovatoViajaDeMontrealAMexicoYSuDestinoActualEsMexico(){
        Destino montreal = new Destino("Montreal");
        Destino mexico = new Destino("Mexico");
        ArrayList<Destino> destinos = new ArrayList<>();
        destinos.add(montreal);
        destinos.add(mexico);

        Mapa mapa = new Mapa(destinos);
        Detective detective = new Detective("Jesus", mapa);

        detective.viajar(mexico);

        assertEquals(mexico,detective.destinoActual());
    }

    @Test
    public void detectiveNovatoViajaDeMontrealAMexicoYDemora5Horas(){
        Destino montreal = new Destino("Montreal");
        Destino mexico = new Destino("Mexico");
        ArrayList<Destino> destinos = new ArrayList<>();
        destinos.add(montreal);
        destinos.add(mexico);

        Mapa mapa = new Mapa(destinos);
        Detective detective = new Detective("Jesus", mapa);

        detective.viajar(mexico);

        assertEquals("Lunes , 12:00", detective.fechaActual());
    }

    @Test
    public void detectiveVisita3VecesPuertoYMuestraPistaYVisita55VecesAeropuerto(){
        Detective detective = new Detective("Mabel");
        Pista pista_aeropuerto = new Pista("Esta a una distancia de 250 km");
        Pista pista_puerto = new Pista("Verde blanco y rojo");

        Puerto puerto = new Puerto(pista_puerto);
        Aeropuerto aeropuerto = new Aeropuerto(pista_aeropuerto);

        detective.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , detective.mostrarPista());
        detective.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , detective.mostrarPista());
        detective.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , detective.mostrarPista());

        assertThrows(TiempoAgotadoException.class,() -> {
            for(int i = 0; i<54 ; i++){
                detective.entrar(puerto);
                assertEquals(pista_puerto , detective.mostrarPista());
            }
        });

    }

    @Test
    public void detectiveRecibeCuchilladaYDuermeDosHoras(){
        Detective detective = new Detective("Milanessi");

        detective.recibirCuchillada();
        assertEquals("Lunes , 9:00", detective.fechaActual());
    }

    @Test
    public void detectiveRecibeSegundaCuchilladaYDuermeUnaHoras(){
        Detective detective = new Detective("Milanessi");

        detective.recibirCuchillada();
        detective.recibirCuchillada();
        assertEquals("Lunes , 10:00", detective.fechaActual());
    }

    @Test
    public void detectiveRecibeHeridaPorArmaDeFuegoYDuermeCuatroHoras(){
        Detective detective = new Detective("Milanessi");

        detective.recibirBalazo();
        assertEquals("Lunes , 11:00", detective.fechaActual());

    }
}
