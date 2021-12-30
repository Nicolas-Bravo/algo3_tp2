package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.pistas.PistaEconomica;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void entrarAUnBancoPorPrimeraVezDemoraUnaHora(){
        Banco e = new Banco(new PistaEconomica("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);

        assertEquals("Lunes , 8:00", r.fechaActual());
    }

    @Test
    public void entrarAUnBancoPorSegundaVezDemoraDosHora(){
        Banco e = new Banco(new PistaEconomica("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 10:00", r.fechaActual());
    }


    @Test
    public void entrarAUnBancoPorTerceraVezDemoraTresHora(){
        Banco e = new Banco(new PistaEconomica("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 13:00", r.fechaActual());
    }

    @Test
    public void entrarAUnBancoPorCuartaVezDemoraTresHora(){
        Banco e = new Banco(new PistaEconomica("una pista aux"));
        Reloj r = new Reloj();

        e.entrar(r);
        e.entrar(r);
        e.entrar(r);
        e.entrar(r);

        assertEquals("Lunes , 16:00", r.fechaActual());
    }

    @Test
    public void entrarAUnBancoDevuelveLaPistaEconomicaConElQueFueConstruido(){
        PistaEconomica p = new PistaEconomica("pista de prueba");
        Banco e = new Banco(p);
        Reloj r = new Reloj();

        assertEquals(p, e.entrar(r));
    }
}
