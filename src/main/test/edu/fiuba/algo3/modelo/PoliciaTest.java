package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.rango.*;
import edu.fiuba.algo3.modelo.valor.*;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;

import static org.junit.jupiter.api.Assertions.*;

public class PoliciaTest {

    @Test
    public void novatoEntraAlBancoYMuestraPista(){

        Pista pista = new Pista("La moneda es el peso mexicano");

        Banco banco = new Banco(pista);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco);

        Tesoro tesoro = new Tesoro(Montreal, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(Montreal);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Novato());

        policia.asignarCaso(caso);

        policia.entrar(banco);

        assertEquals(pista , policia.mostrarPista());
    }

    @Test
    public void novatoEntraAlBancoYMuestraPistaYEntraBiblioYMuestraPista(){

        Pista pista_banco = new Pista("La moneda es el peso mexicano");
        Banco banco = new Banco(pista_banco);

        Pista pista_biblioteca = new Pista("Son descendientes de los aztecas");
        Biblioteca biblioteca = new Biblioteca(pista_biblioteca);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, banco, biblioteca);

        Tesoro tesoro = new Tesoro(Montreal, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(Montreal);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Novato());

        policia.asignarCaso(caso);

        policia.entrar(banco);
        assertEquals(pista_banco , policia.mostrarPista());

        policia.entrar(biblioteca);
        assertEquals(pista_biblioteca , policia.mostrarPista());

    }



    @Test
    public void novatoViajaDeMontrealAMexicoYSuDestinoActualEsMexico(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);

        Tesoro tesoro = new Tesoro(Montreal, new Comun());

        Banco edif_mexico = new Banco(pista);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        RutaDeEscape ruta = new RutaDeEscape(Mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Novato());
        policia.asignarCaso(caso);

        policia.viajar(Mexico);

        assertEquals(Mexico, policia.destinoActual());
    }

    @Test
    public void novatoViajaDeMontrealAMexicoYDemoraCuatroHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);

        Tesoro tesoro = new Tesoro(Montreal, new Comun());

        Banco edif_mexico = new Banco(pista);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        RutaDeEscape ruta = new RutaDeEscape(Mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Novato());
        policia.asignarCaso(caso);

        policia.viajar(Mexico);

        assertEquals("Lunes , 11:00", policia.fechaActual());
    }


    @Test
    public void detectiveViajaDeMontrealAMexicoYDemoraTresHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);

        Tesoro tesoro = new Tesoro(Montreal, new Valioso());

        Banco edif_mexico = new Banco(pista);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        RutaDeEscape ruta = new RutaDeEscape(Mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Detective());

        policia.asignarCaso(caso);

        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void investigadorViajaDeMontrealAMexicoYDemoraTresHoras(){
        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);

        Tesoro tesoro = new Tesoro(Montreal, new Valioso());

        Banco edif_mexico = new Banco(pista);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        RutaDeEscape ruta = new RutaDeEscape(Mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Investigador());

        policia.asignarCaso(caso);
        policia.viajar(Mexico);

        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void sargentoViajaDeMontrealAMexicoYDemoraDosHoras(){

        Pista pista = new Pista("Una pista auxiliar");

        Banco edif_montreal = new Banco(pista);
        Destino Montreal = new Destino("Montreal", 45.50884, 73.58781, edif_montreal);

        Tesoro tesoro = new Tesoro(Montreal, new MuyValioso());

        Banco edif_mexico = new Banco(pista);
        Destino Mexico = new Destino("Mexico", 19.42847, 99.12766 , edif_mexico);

        RutaDeEscape ruta = new RutaDeEscape(Mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia policia = new Policia("Alberto", new Sargento());

        policia.asignarCaso(caso);

        policia.viajar(Mexico);

        assertEquals("Lunes , 9:00", policia.fechaActual());
    }


    @Test
    public void novatoVisita3VecesPuertoYMuestraPistaYVisita55VecesAeropuerto(){


        Pista pista_aeropuerto = new Pista("Esta a una distancia de 250 km");
        Aeropuerto aeropuerto = new Aeropuerto(pista_aeropuerto);

        Pista pista_puerto = new Pista("Verde blanco y rojo");
        Puerto puerto = new Puerto(pista_puerto);

        Destino Montreal = new Destino("Montreal", 45.50884, 73.5878, puerto, aeropuerto);

        Tesoro tesoro = new Tesoro(Montreal, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(Montreal);

        Policia policia = new Policia("Alberto", new Novato());

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);
        policia.asignarCaso(caso);

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

        Policia policia = new Policia("Alberto", new Novato());

        policia.recibirCuchillada();
        assertEquals("Lunes , 9:00", policia.fechaActual());
    }

    @Test
    public void novatoRecibeSegundaCuchilladaYDuermeUnaHoras(){

        Policia policia = new Policia("Alberto", new Novato());

        policia.recibirCuchillada();
        policia.recibirCuchillada();
        assertEquals("Lunes , 10:00", policia.fechaActual());
    }

    @Test
    public void novatoRecibeHeridaPorArmaDeFuegoYDuermeCuatroHoras(){

        Policia policia = new Policia("Alberto", new Novato());

        policia.recibirBalazo();
        assertEquals("Lunes , 11:00", policia.fechaActual());

    }

    @Test
    public void NovatoEntraAUnEdificioDeLaCiudadFinalYObtienePistaSospechosoVistoRecientemente(){

        Edificio edificioInicial = new Banco(new Pista("Una pista aux"));
        Destino destinoInicial = new Destino("Montreal", 45.50884, 73.5878, edificioInicial);

        Edificio edificioFinal = new Aeropuerto(new Pista("Otra pista aux"));
        Destino destinoFinal = new Destino("Mexico", 19.42847, 99.12766 , edificioFinal);

        Tesoro tesoro = new Tesoro(destinoInicial, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(destinoFinal);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia novato = new Policia("Esteban", new Novato());
        novato.asignarCaso(caso);

        novato.viajar(destinoFinal);
        novato.entrar(edificioFinal);

        assertEquals(new Pista("Sospechoso visto recientemente"),novato.mostrarPista());
}

    @Test
    public void intentoDeArrestoDeSospechosoSinOrdenNoSumaArresto(){

        Edificio edificioInicial = new Banco(new Pista("Una pista aux"));
        Destino destinoInicial = new Destino("Montreal", 45.50884, 73.5878, edificioInicial);

        Edificio edificioFinal = new Aeropuerto(new Pista("Otra pista aux"));
        Destino destinoFinal = new Destino("Mexico", 19.42847, 99.12766 , edificioFinal);

        Tesoro tesoro = new Tesoro(destinoInicial, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(destinoFinal);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia novato = new Policia("Esteban", new Novato());
        novato.asignarCaso(caso);

        novato.viajar(destinoFinal);
        novato.entrar(edificioFinal);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(edificioFinal);
        assertEquals(0, novato.cantidadDeArrestos());
    }


    @Test
    public void intentoDeArrestoDeSospechosoConOrdenSumaArresto(){

        Edificio edificioInicial = new Banco(new Pista("Una pista aux"));
        Destino destinoInicial = new Destino("Montreal", 45.50884, 73.5878, edificioInicial);

        Edificio edificioFinal = new Aeropuerto(new Pista("Otra pista aux"));
        Destino destinoFinal = new Destino("Mexico", 19.42847, 99.12766 , edificioFinal);

        Tesoro tesoro = new Tesoro(destinoInicial, new Comun());

        RutaDeEscape ruta = new RutaDeEscape(destinoFinal);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia novato = new Policia("Esteban", new Novato());

        novato.asignarCaso(caso);
        novato.emitirOrdenDeArresto(
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Convertible"),
                new Pista("Negro"),
                new Pista("Joyeria") );

        novato.viajar(destinoFinal);
        novato.entrar(edificioFinal);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(edificioFinal);
        assertEquals(1, novato.cantidadDeArrestos());
    }



    @Test
    public void PoliciaHace6ArrestosTomaUnCasoRealizaInvestigacionEmiteOrdenYArresta(){

        Edificio edificioInicial = new Banco(new Pista("Una pista aux"));
        Destino destinoInicial = new Destino("Montreal", 45.50884, 73.5878, edificioInicial);

        Edificio edificioFinal = new Aeropuerto(new Pista("Otra pista aux"));
        Destino destinoFinal = new Destino("Mexico", 19.42847, 99.12766 , edificioFinal);

        Tesoro tesoro = new Tesoro(destinoInicial, new Comun());

        Policia policia = new Policia("Esteban", new Novato());

        for(int i =0; i<6; i++){
            policia.asignarCaso(new Caso("Fast Eddie B.", tesoro, new RutaDeEscape(destinoInicial, destinoFinal)));
            policia.viajar(destinoFinal);
            policia.emitirOrdenDeArresto(
                    new Pista("Masculino"),
                    new Pista("Croquet"),
                    new Pista("Convertible"),
                    new Pista("Negro"),
                    new Pista("Joyeria") );
            policia.entrar(edificioFinal);
            policia.entrar(edificioFinal);
        }
        assertEquals(6, policia.cantidadDeArrestos());
    }

}
