package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void entrarPorPrimeraVezDemoraUnaHora(){
        Edificio edificio = new Edificio( new PistaEscrita("El ladron se fue a china") );

        int tiempo = edificio.entrar();

        assertEquals(1, tiempo);
    }

    @Test
    public void entrarPorSegundaVezDemoraDosHoras(){
        Edificio edificio = new Edificio( new PistaEscrita("El ladron se fue a china") );

        int tiempo = edificio.entrar();
        tiempo = edificio.entrar();

        assertEquals(2, tiempo);
    }


    @Test
    public void entrarPorTerceraVezDemoraTresHoras(){
        Edificio edificio = new Edificio( new PistaEscrita("El ladron se fue a china") );

        int tiempo = edificio.entrar();
        tiempo = edificio.entrar();
        tiempo = edificio.entrar();

        assertEquals(3, tiempo);
    }

    @Test
    public void entrarPorMasDeTresVecesDemoraTresHoras(){
        Edificio edificio = new Edificio( new PistaEscrita("El ladron se fue a china") );

        int tiempo = edificio.entrar();
        tiempo = edificio.entrar();
        tiempo = edificio.entrar();
        tiempo = edificio.entrar();
        tiempo = edificio.entrar();

        assertEquals(3, tiempo);
    }

}
