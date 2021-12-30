package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PistaTest {

    @Test
    public void pistaMuestraElStringConElQueFueConstruido(){
        String texto = "una pista";
        Pista pista = new PistaGeneral(texto);

        assertEquals(texto, pista.mostrarPista());
    }

    @Test
    public void pistaMuestraElStringConElQueFueSrobeescrito(){
        String texto = "una pista";
        Pista pista = new PistaGeneral("pista original");
        pista.sobreescribir(texto);

        assertEquals(texto, pista.mostrarPista());
    }

    @Test
    public void dosInstanciasDePistaConDistintoCOntinidoNoSonIguales(){
        Pista pista_1 = new PistaGeneral("un texto");
        Pista pista_2 = new PistaGeneral("otro texto");

        assertNotEquals(pista_1, pista_2);
    }

    @Test
    public void dosInstanciasDePistaConElMismoContenidoSonIguales(){
        String texto = "una pista";
        Pista pista_1 = new PistaGeneral(texto);
        Pista pista_2 = new PistaGeneral(texto);

        assertEquals(pista_1, pista_2);
    }


}
