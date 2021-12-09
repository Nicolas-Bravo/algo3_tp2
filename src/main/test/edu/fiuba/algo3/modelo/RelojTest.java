package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelojTest {

    @Test
    public void aumentarUnaHoraAunRelojNuevoLoDejaEnLunesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(1);

        assertEquals("Lunes , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarDieciochoHorasAunRelojNuevoLoDejaEnMartesALaUna(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(18);

        assertEquals("Martes , 1:00", reloj.fechaActual());

    }

    @Test
    public void aumentarCienHorasAUnRelojNuevoLoDejaEnViernesALasOnce(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(100);

        assertEquals("Viernes , 11:00", reloj.fechaActual());

    }

    @Test
    public void aumentarCientoSesentaHorasAUnRelojNuevoGeneraTiempoAgotadoException(){

        Reloj reloj = new Reloj();

        assertThrows(TiempoAgotadoException.class,() -> {
            reloj.aumentarHoras(160);
        });

    }



}
