package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void entrarAUnEdificioPorPrimeraVezDemoraUnaHora(){
        Edificio e = new Edificio(new Pista("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }

    @Test
    public void entrarAUnEdificioPorSegundaVezDemoraDosHora(){
        Edificio e = new Edificio(new Pista("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 10:00", r.fechaActual());
    }


    @Test
    public void entrarAUnEdificioPorTerceraVezDemoraTresHora(){
        Edificio e = new Edificio(new Pista("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 13:00", r.fechaActual());
    }

    @Test
    public void entrarAUnEdificioPorCuartaVezDemoraTresHora(){
        Edificio e = new Edificio(new Pista("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);
        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 16:00", r.fechaActual());
    }

    @Test
    public void entrarAUnEdificioDevuelveLaPistaConElQueFueConstruido(){
        Pista p = new Pista("pista de prueba");
        Edificio e = new Edificio(p);
        Reloj r = new Reloj();

        assertEquals(p, e.entrar(r));
    }
}
