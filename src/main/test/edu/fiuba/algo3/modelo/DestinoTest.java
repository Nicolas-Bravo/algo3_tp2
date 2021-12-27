package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestinoTest {

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorPrimeraVezYDemoraUnaHora(){
        Edificio edificio = new Edificio(new Pista("Una pista aux"));
        Destino destino = new Destino("destino", 10.00,10.00,edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 8:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorSegundaVezYDemoraDosHoras(){
        Edificio edificio = new Edificio(new Pista("Una pista aux"));
        Destino destino = new Destino("destino", 10.00,10.00,edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 10:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponePorTerceraVezYDemoraTresHoras(){
        Edificio edificio = new Edificio(new Pista("Una pista aux"));
        Destino destino = new Destino("destino", 10.00,10.00,edificio);
        Reloj reloj = new Reloj();

        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);
        destino.entrar(reloj,edificio);

        assertEquals("Lunes , 13:00", reloj.fechaActual());
    }

    @Test
    public void detinoEntraAUnEdicioQueLoComponeYObtieneSuPista(){
        Pista p = new Pista("pista de prueba");
        Edificio edificio = new Edificio(p);
        Destino destino = new Destino("destino", 10.00,10.00,edificio);
        Reloj reloj = new Reloj();


        assertEquals(p, destino.entrar(reloj,edificio));
    }
}
