package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import static org.junit.jupiter.api.Assertions.*;

public class PoliciaTest {

    @Test
    public void novatoEntraAlBancoYMuestraPista(){

        Pista pista = new Pista("La moneda es el peso mexicano");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco);

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

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco, biblioteca);
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

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Novato(), mapa);

        policia.viajar(Mexico);

        assertEquals(Mexico, policia.destinoActual());
    }

    @Test
    public void novatoViajaDeMontrealAMexicoYDemoraCuatroHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Novato(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 11:00", policia.fechaActual());
    }


    @Test
    public void detectiveViajaDeMontrealAMexicoYDemoraTresHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Detective(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void investigadorViajaDeMontrealAMexicoYDemoraTresHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Investigador(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void sargentoViajaDeMontrealAMexicoYDemoraDosHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Banco edif_mexico = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        Mapa mapa = new Mapa(Montreal, Mexico);
        Policia policia = new Policia("Jesus", new Sargento(), mapa);

        policia.viajar(Mexico);

        assertEquals("Lunes , 9:00", policia.fechaActual());
    }


    @Test
    public void novatoVisita3VecesPuertoYMuestraPistaYVisita55VecesAeropuerto(){


        Pista pista_aeropuerto = new Pista("Esta a una distancia de 250 km");
        Pista pista_puerto = new Pista("Verde blanco y rojo");

        Puerto puerto = new Puerto(pista_puerto);
        Aeropuerto aeropuerto = new Aeropuerto(pista_aeropuerto);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.5878, puerto, aeropuerto);
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

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.recibirCuchillada();
        assertEquals("Lunes , 9:00", policia.fechaActual());
    }

    @Test
    public void novatoRecibeSegundaCuchilladaYDuermeUnaHoras(){

        Pista pista = new Pista("Una pista aux");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco);

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

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco);

        Mapa mapa = new Mapa(Montreal);

        Policia policia = new Policia("Alberto", new Novato(), mapa);

        policia.recibirBalazo();
        assertEquals("Lunes , 11:00", policia.fechaActual());

    }
    @Test
    public void intentoDeArrestoDeSospechosoSinOrdenNoSumaArresto(){
        EdificioFinal edificio = new EdificioFinal(new Pista("Sospechoso visto recientemente"));
        DestinoFinal destino = new DestinoFinal("Montreal", 45.50884, 73.5878, edificio);
        Mapa mapa = new Mapa(destino);
        Policia novato = new Policia("Esteban", new Novato(), mapa);
        Caso caso = new Caso("Fast Eddie B.");
        novato.asignarCaso(caso);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(edificio);
        assertEquals(0, novato.cantidadDeArrestos());
    }

    @Test
    public void PoliciaHace6ArrestosTomaUnCasoRealizaInvestigacionEmiteOrdenYArresta(){
            EdificioFinal edificio = new EdificioFinal(new Pista("Sospechoso visto recientemente"));
            DestinoFinal destino = new DestinoFinal("Montreal", 45.50884, 73.5878, edificio);
            Mapa mapa = new Mapa(destino);
            Policia novato = new Policia("Esteban", new Novato(), mapa);
            Caso caso = new Caso("Fast Eddie B.");
            novato.asignarCaso(caso);

        for(int i =0; i<6; i++){
            novato.emitirOrdenDeArresto(
                    new Pista("Masculino"),
                    new Pista("Croquet"),
                    new Pista("Convertible"),
                    new Pista("Negro"),
                    new Pista("Joyeria") );
            novato.entrar(edificio);
        }
        assertEquals(6, novato.cantidadDeArrestos());
    }
}
