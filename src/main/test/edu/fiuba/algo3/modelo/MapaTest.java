package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.core.Coordenadas;
import edu.fiuba.algo3.modelo.core.Destino;
import edu.fiuba.algo3.modelo.core.Mapa;
import edu.fiuba.algo3.modelo.edificios.Banco;
import edu.fiuba.algo3.modelo.pistas.PistaEconomica;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapaTest {

    @Test
    public void mapaConstuidoConUnDestinoLoTieneComoDestinoActual(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);

        assertEquals(destinoUno, mapa.destinoActual());
    }

    @Test
    public void mapaEntraAUnBancoDeSuCiudadActualYDemoraUnaHora(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }


    @Test
    public void mapaEntraAUnBancoDeSuCiudadActualPorSegundaVezYDemoraDosHoras(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 10:00", r.fechaActual());
    }

    @Test
    public void mapaEntraAUnBancoDeSuCiudadActualPorTerceraVezYDemoraTresHoras(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 13:00", r.fechaActual());
    }

    @Test
    public void mapaEntraAUnBancoDeSuCiudadActualYObtieneSuPistaEconomica(){
        PistaEconomica p = new PistaEconomica("pista de prueba");
        Banco edificioUno = new Banco(p);
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);

        assertEquals(p, mapa.entrar(r,edificioUno));
    }

    @Test
    public void mapaViajaAOtroDestinoYCambiaSuDestinoActual(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Banco edificioDos = new Banco(new PistaEconomica("otra pista aux"));
        Destino destinoDos = new Destino(new PistaGeneral("nombreDos"),new Coordenadas(20.00,20.00),edificioDos);

        Mapa mapa = new Mapa(destinoUno, destinoDos);

        mapa.viajar(destinoDos);

        assertEquals(destinoDos, mapa.destinoActual());
    }

    @Test
    public void mapaViajaAOtroDestinoEntraAUnBancoYDemoraUnaHora(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino destinoUno = new Destino(new PistaGeneral("nombreUNo"),new Coordenadas(10.00,10.00),edificioUno);

        Banco edificioDos = new Banco(new PistaEconomica("otra pista aux"));
        Destino destinoDos = new Destino(new PistaGeneral("nombreDos"),new Coordenadas(20.00,20.00),edificioDos);

        Mapa mapa = new Mapa(destinoUno, destinoDos);
        Reloj r = new Reloj();

        mapa.viajar(destinoDos);
        mapa.entrar(r, edificioDos);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }

    @Test
    public void mapaViajaDesdeMontralAMexicoYDevuelDistancia3725km(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino montreal = new Destino(new PistaGeneral("Montreal"), new Coordenadas(45.50884, -73.5878), edificioUno);

        Banco edificioDos = new Banco(new PistaEconomica("otra pista aux"));
        Destino mexico = new Destino(new PistaGeneral("Mexico"), new Coordenadas(19.42847, -99.12766), edificioDos);

        Mapa mapa = new Mapa(montreal, mexico);

        assertEquals(3725.00, mapa.viajar(mexico),10.00);
    }


    @Test
    public void mapaViajaDesdeMontralALimaYDevuelDistancia6400km(){
        Banco edificioUno = new Banco(new PistaEconomica("una pista aux"));
        Destino montreal = new Destino(new PistaGeneral("Montreal"), new Coordenadas(45.50884, -73.5878), edificioUno);

        Banco edificioDos = new Banco(new PistaEconomica("otra pista aux"));
        Destino lima = new Destino(new PistaGeneral("Lima"), new Coordenadas(-12.04318  , -77.02824), edificioDos);

        Mapa mapa = new Mapa(montreal, lima);

        assertEquals(6400.00, mapa.viajar(lima),10.00);
    }

}
