package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import static org.junit.jupiter.api.Assertions.*;

public class PoliciaTest {

    @Test
    public void novatoEntraAlBancoYMuestraPista(){

        Pista pista = new Pista("La moneda es el peso mexicano");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.entrar(banco);

        assertEquals(pista , policia.mostrarPista());
    }

    @Test
    public void novatoEntraAlBancoYMuestraPistaYEntraBiblioYMuestraPista(){

        Pista pista_banco = new Pista("La moneda es el peso mexicano"); //Por archivos
        Pista pista_biblioteca = new Pista("Son descendientes de los aztecas");

        Banco banco = new Banco(pista_banco);
        Biblioteca biblioteca = new Biblioteca(pista_biblioteca);

        Destino Montreal = new Destino("Montreal", banco, biblioteca);
        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Tomas", new Novato(), mapa);

        policia.entrar(banco);
        assertEquals(pista_banco , policia.mostrarPista());

        policia.entrar(biblioteca);
        assertEquals(pista_biblioteca , policia.mostrarPista());

    }



    @Test
    public void novatoViajaDeMontrealAMexicoYSuDestinoActualEsMexico(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Novato(), mapa);

        policia.viajar(Mexico);

        assertEquals(Mexico, policia.destinoActual());
    }

    @Test
    public void novatoViajaDeMontrealAMexicoYDemoraCincoHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Novato(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 12:00", policia.fechaActual());
    }

    @Test
    public void novatoVisita3VecesPuertoYMuestraPistaYVisita55VecesAeropuerto(){


        Pista pista_aeropuerto = new Pista("Esta a una distancia de 250 km");
        Pista pista_puerto = new Pista("Verde blanco y rojo");

        Puerto puerto = new Puerto(pista_puerto);
        Aeropuerto aeropuerto = new Aeropuerto(pista_aeropuerto);

        Destino Montreal = new Destino("Montreal", puerto, aeropuerto);
        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Tomas", new Novato(), mapa);


        policia.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , policia.mostrarPista());
        policia.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , policia.mostrarPista());
        policia.entrar(aeropuerto);
        assertEquals(pista_aeropuerto , policia.mostrarPista());

        assertThrows(TiempoAgotadoException.class,() -> {
            for(int i = 0; i<54 ; i++){
                policia.entrar(puerto);
                assertEquals(pista_puerto , policia.mostrarPista());
            }
        });

    }

    @Test
    public void novatoRecibeCuchilladaYDuermeDosHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.recibirCuchillada();
        assertEquals("Lunes , 9:00", policia.fechaActual());
    }

    @Test
    public void novatoRecibeSegundaCuchilladaYDuermeUnaHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.recibirCuchillada();
        policia.recibirCuchillada();
        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void novatoRecibeHeridaPorArmaDeFuegoYDuermeCuatroHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.recibirBalazo();
        assertEquals("Lunes , 11:00", policia.fechaActual());

    }

    @Test
    public void detectiveViajaDeMontrealAMexicoYDemoraCuatroHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Detective(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 11:00", policia.fechaActual());
    }

    @Test
    public void investigadorViajaDeMontrealAMexicoYDemoraTresHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Investigador(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void sargentoViajaDeMontrealAMexicoYDemoraTresHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", edif_montreal);
        Destino Mexico = new Destino("Mexico", edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Sargento(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }
    @Test
    public void intentoDeArrestoDeSospechosoSinOrdenNoSumaArresto(){
        EdificioFinal edificio = new EdificioFinal(new Pista("Sospechoso visto recientemente"));
        DestinoFinal destino = new DestinoFinal("Moscu", edificio);
        Mapa mapa = new Mapa(destino);
        Policia novato = new Policia("Esteban", new Novato(), mapa);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(edificio);
        assertEquals(0, novato.cantidadDeArrestos());
    }

}
