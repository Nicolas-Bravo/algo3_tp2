package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class casosDeUsoTest{

    @Test
    public void casoDeUso1(){

        Caso caso1 = new Caso("tesoro Nacional de Montereal", "femenino" , "Montereal" , new Detective("elNovato"));

        assertFalse(caso1.bancoMostroPista());

        caso1.entrarBanco();

        assertTrue(caso1.bancoMostroPista());

    }

    @Test
    public void casoDeUso2(){

        Caso caso2 = new Caso("tesoro Nacional de Montereal", "femenino" , "Montereal" , new Detective("elNovato"));

        assertFalse(caso2.bancoMostroPista());

        caso2.entrarBanco();

        assertTrue(caso2.bancoMostroPista());

        assertFalse(caso2.bibliotecaMostroPista());

        caso2.entrarBiblioteca();

        assertTrue(caso2.bibliotecaMostroPista());
    }
}