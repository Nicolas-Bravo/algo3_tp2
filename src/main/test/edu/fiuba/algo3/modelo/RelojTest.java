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
    public void aumentarDiecisieteHorasAunRelojNuevoLoDejaEnMartesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(17);

        assertEquals("Martes , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarTreintaYTresHorasAUnRelojNuevoLoDejaEnMiercolesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(33);

        assertEquals("Miercoles , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarCuarentaYNueveHorasAUnRelojNuevoLoDejaEnJuevesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(49);

        assertEquals("Jueves , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarSecentaYNueveHorasAUnRelojNuevoLoDejaEnViernesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(65);

        assertEquals("Viernes , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarOchentaYUnaHorasAUnRelojNuevoLoDejaEnSabadoALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(81);

        assertEquals("Sabado , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarNoventaYSieteHorasAUnRelojNuevoLoDejaEnDomingoALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(97);

        assertEquals("Domingo , 8:00", reloj.fechaActual());

    }

    @Test
    public void aumentarCientoSesentaHorasAUnRelojNuevoGeneraTiempoAgotadoException(){

        Reloj reloj = new Reloj();

        assertThrows(TiempoAgotadoException.class,() -> {
            reloj.aumentarHoras(160);
        });

    }



}
