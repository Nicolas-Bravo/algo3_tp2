package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.Pista;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapaTest {

    @Test
    public void mapaConstuidoConUnDestinoLoTieneComoDestinoActual(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);

        assertEquals(destinoUno, mapa.destinoActual());
    }

    @Test
    public void mapaEntraAUnEdificioDeSuCiudadActualYDemoraUnaHora(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }


    @Test
    public void mapaEntraAUnEdificioDeSuCiudadActualPorSegundaVezYDemoraDosHoras(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 10:00", r.fechaActual());
    }

    @Test
    public void mapaEntraAUnEdificioDeSuCiudadActualPorTerceraVezYDemoraTresHoras(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);
        mapa.entrar(r,edificioUno);

        assertEquals("Lunes , 13:00", r.fechaActual());
    }

    @Test
    public void mapaEntraAUnEdificioDeSuCiudadActualYObtieneSuPista(){
        Pista p = new Pista("pista de prueba");
        Edificio edificioUno = new Edificio(p);
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Mapa mapa = new Mapa(destinoUno);
        Reloj r = new Reloj();

        mapa.entrar(r,edificioUno);

        assertEquals(p, mapa.entrar(r,edificioUno));
    }

    @Test
    public void mapaViajaAOtroDestinoYCambiaSuDestinoActual(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Edificio edificioDos = new Edificio(new Pista("otra pista aux"));
        Destino destinoDos = new Destino("nombreDos",new Coordenadas(20.00,20.00),edificioDos);

        Mapa mapa = new Mapa(destinoUno, destinoDos);

        mapa.viajar(destinoDos);

        assertEquals(destinoDos, mapa.destinoActual());
    }

    @Test
    public void mapaViajaAOtroDestinoEntraAUnEdificioYDemoraUnaHora(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino destinoUno = new Destino("nombreUNo",new Coordenadas(10.00,10.00),edificioUno);

        Edificio edificioDos = new Edificio(new Pista("otra pista aux"));
        Destino destinoDos = new Destino("nombreDos",new Coordenadas(20.00,20.00),edificioDos);

        Mapa mapa = new Mapa(destinoUno, destinoDos);
        Reloj r = new Reloj();

        mapa.viajar(destinoDos);
        mapa.entrar(r, edificioDos);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }

    @Test
    public void mapaViajaDesdeMontralAMexicoYDevuelDistancia3725km(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino montreal = new Destino("Montreal", new Coordenadas(45.50884, -73.5878), edificioUno);

        Edificio edificioDos = new Edificio(new Pista("otra pista aux"));
        Destino mexico = new Destino("Mexico", new Coordenadas(19.42847, -99.12766), edificioDos);

        Mapa mapa = new Mapa(montreal, mexico);

        assertEquals(3725.00, mapa.viajar(mexico),10.00);
    }


    @Test
    public void mapaViajaDesdeMontralALimaYDevuelDistancia6400km(){
        Edificio edificioUno = new Edificio(new Pista("una pista aux"));
        Destino montreal = new Destino("Montreal", new Coordenadas(45.50884, -73.5878), edificioUno);

        Edificio edificioDos = new Edificio(new Pista("otra pista aux"));
        Destino lima = new Destino("Lima", new Coordenadas(-12.04318  , -77.02824), edificioDos);

        Mapa mapa = new Mapa(montreal, lima);

        assertEquals(6400.00, mapa.viajar(lima),10.00);
    }

}
