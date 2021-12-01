package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RelojTest {

    /*@Test
    public void aumentarUnaHoraAunRelojNuevoLoDejaEnLunesALasOcho(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(1);

        assertTrue( reloj.esDia("Lunes") );
        assertTrue( reloj.esHora(8) );

    }

    @Test
    public void aumentarDieciochoHorasAunRelojNuevoLoDejaEnMartesALaUna(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(18);

        assertTrue( reloj.esDia("Martes") );
        assertTrue( reloj.esHora(1) );

    }

    @Test
    public void aumentarCienHorasAUnRelojNuevoLoDejaEnViernesALasOnce(){

        Reloj reloj = new Reloj();

        reloj.aumentarHoras(100);

        assertTrue( reloj.esDia("Viernes") );
        assertTrue( reloj.esHora(11) );

    }*/

    @Test
    public void aumentarCientoSesentaHorasAUnRelojNuevoGeneraTiempoAgotadoException(){

        Reloj reloj = new Reloj();

        assertThrows(TiempoAgotadoException.class,() -> {
            reloj.aumentarHoras(160);
        });

    }



}
