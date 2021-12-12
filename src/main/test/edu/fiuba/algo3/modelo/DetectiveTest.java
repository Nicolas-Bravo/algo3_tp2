package edu.fiuba.algo3.modelo;


import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import static org.junit.jupiter.api.Assertions.*;

public class DetectiveTest {

    @Test
    public void detectiveEntraAlBancoYMuestraPista(){

        Pista pista = new Pista("La moneda es el peso mexicano");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Alberto", mapa);

        detective.entrar(banco);

        assertEquals(pista , detective.mostrarPista());
    }

    @Test
    public void detectiveEntraAlBancoYMuestraPistaYEntraBiblioYMuestraPista(){

        Pista pista_banco = new Pista("La moneda es el peso mexicano"); //Por archivos
        Pista pista_biblioteca = new Pista("Son descendientes de los aztecas");

        Banco banco = new Banco(pista_banco);
        Biblioteca biblioteca = new Biblioteca(pista_biblioteca);

        Destino Montreal = new Destino("Montreal", banco, biblioteca);
        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Tomas", mapa);

        detective.entrar(banco);
        assertEquals(pista_banco , detective.mostrarPista());

        detective.entrar(biblioteca);
        assertEquals(pista_biblioteca , detective.mostrarPista());

    }



    @Test
    public void detectiveNovatoViajaDeMontrealAMexicoYSuDestinoActualEsMexico(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Detective detective = new Detective("Jesus", mapa);

        detective.viajar(Mexico);

        assertEquals(Mexico,detective.destinoActual());
    }

    @Test
    public void detectiveNovatoViajaDeMontrealAMexicoYDemora5Horas(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Detective detective = new Detective("Jesus", mapa);

        detective.viajar(Mexico);

        assertEquals("Lunes , 12:00", detective.fechaActual());
    }

    @Test
    public void detectiveVisita3VecesPuertoYMuestraPistaYVisita55VecesAeropuerto(){


        Pista pista_aeropuerto = new Pista("Esta a una distancia de 250 km");
        Pista pista_puerto = new Pista("Verde blanco y rojo");

        Puerto puerto = new Puerto(pista_puerto);
        Aeropuerto aeropuerto = new Aeropuerto(pista_aeropuerto);

        Destino Montreal = new Destino("Montreal", puerto, aeropuerto);
        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Tomas", mapa);


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

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Alberto", mapa);

        detective.recibirCuchillada();
        assertEquals("Lunes , 9:00", detective.fechaActual());
    }

    @Test
    public void detectiveRecibeSegundaCuchilladaYDuermeUnaHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Alberto", mapa);

        detective.recibirCuchillada();
        detective.recibirCuchillada();
        assertEquals("Lunes , 10:00", detective.fechaActual());
    }

    @Test
    public void detectiveRecibeHeridaPorArmaDeFuegoYDuermeCuatroHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Detective detective = new Detective("Alberto", mapa);

        detective.recibirBalazo();
        assertEquals("Lunes , 11:00", detective.fechaActual());

    }
}
