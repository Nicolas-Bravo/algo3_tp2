package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PistaTest {

    @Test
    public void pistaMuestraElStringConElQueFueConstruido(){
        String texto = "una pista";
        Pista pista = new Pista(texto);

        assertEquals(texto, pista.mostrarPista());
    }

    @Test
    public void pistaMuestraElStringConElQueFueSrobeescrito(){
        String texto = "una pista";
        Pista pista = new Pista("pista original");
        pista.sobreescribir(texto);

        assertEquals(texto, pista.mostrarPista());
    }

    @Test
    public void dosInstanciasDePistaConDistintoCOntinidoNoSonIguales(){
        Pista pista_1 = new Pista("un texto");
        Pista pista_2 = new Pista("otro texto");

        assertNotEquals(pista_1, pista_2);
    }

    @Test
    public void dosInstanciasDePistaConElMismoContenidoSonIguales(){
        String texto = "una pista";
        Pista pista_1 = new Pista(texto);
        Pista pista_2 = new Pista(texto);

        assertEquals(pista_1, pista_2);
    }


}
