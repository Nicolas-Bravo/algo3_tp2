package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pista.PistaEscrita;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DestinoTest {

    @Test
    public void entrarPorPrimeraVezAEdificioTresDemoraUnaHora(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );

        int tiempo = destino.entrarAEdificio(3);

        assertEquals(1, tiempo);
    }

    @Test
    public void entrarPorSegundaVezAEdificioDosDemoraDosHoras(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );

        int tiempo = destino.entrarAEdificio(2);
        tiempo = destino.entrarAEdificio(2);

        assertEquals(2, tiempo);
    }

    @Test
    public void entrarPorTerceraVezAEdificioUnoDemoraTresHoras(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );

        int tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);

        assertEquals(3, tiempo);
    }

    @Test
    public void entrarMasDeTresVecesAEdificioUnoDemoraTresHoras(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );

        int tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);
        tiempo = destino.entrarAEdificio(1);

        assertEquals(3, tiempo);
    }


    @Test
    public void entrarAlEdificioCeroGereraErrror(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );


        assertThrows(IndexOutOfBoundsException.class,
                ()->{
                    int tiempo = destino.entrarAEdificio(0);
                });
    }

    @Test
    public void entrarAlEdificioCuatroGereraErrror(){

        Destino destino = new Destino( "Madrid",
                new Edificio(new PistaEscrita("El ladron se fue")),
                new Edificio(new PistaEscrita("Aca no esta")),
                new Edificio(new PistaEscrita("Cambio pesos por dolares")) );


        assertThrows(IndexOutOfBoundsException.class,
                ()->{
                    int tiempo = destino.entrarAEdificio(4);
                });
    }



}
