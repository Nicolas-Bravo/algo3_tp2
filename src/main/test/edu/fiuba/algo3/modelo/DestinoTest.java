package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.Banco;
import edu.fiuba.algo3.modelo.pistas.PistaEconomica;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestinoTest {

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorPrimeraVezYDemoraUnaHora(){
        Banco edificio = new Banco(new PistaEconomica("Una pista aux"));
        Destino destino = new Destino(new PistaGeneral("destino"), new Coordenadas(10.00,10.00),edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 8:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorSegundaVezYDemoraDosHoras(){
        Banco edificio = new Banco(new PistaEconomica("Una pista aux"));
        Destino destino = new Destino(new PistaGeneral("destino"), new Coordenadas(10.00,10.00),edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 10:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorTerceraVezYDemoraTresHoras(){
        Banco edificio = new Banco(new PistaEconomica("Una pista aux"));
        Destino destino = new Destino(new PistaGeneral("destino"), new Coordenadas(10.00,10.00),edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 13:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponeYObtieneSuPista(){
        PistaEconomica p = new PistaEconomica("pista de prueba");
        Banco edificio = new Banco(p);
        Destino destino = new Destino(new PistaGeneral("destino"), new Coordenadas(10.00,10.00),edificio);
        Reloj reloj = new Reloj();


        assertEquals(p, destino.entrar(reloj,edificio));
    }
}
