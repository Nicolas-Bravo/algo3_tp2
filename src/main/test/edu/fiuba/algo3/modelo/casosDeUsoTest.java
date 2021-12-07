package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class casosDeUsoTest{

    @Test
    public void casoDeUso1(){

        Caso caso = new Caso("/home/nicolas/Documentos/Algo3/algo3_tp2/algo3_tp2/Archivos/destinos.csv" , new Detective("elNovato"));

        assertFalse(caso.bancoMostroPista());
        caso.entrarBanco();
        assertTrue(caso.esHora(8));
        assertTrue(caso.bancoMostroPista());

    }

    @Test
    public void casoDeUso2(){

        Caso caso = new Caso("/home/nicolas/Documentos/Algo3/algo3_tp2/algo3_tp2/Archivos/destinos.csv" , new Detective("elNovato"));

        assertFalse(caso.bancoMostroPista());

        caso.entrarBanco();

        assertTrue(caso.bancoMostroPista());
        assertTrue(caso.esHora(8));
        assertFalse(caso.bibliotecaMostroPista());


        caso.entrarBiblioteca();
        assertTrue(caso.bibliotecaMostroPista());
        assertTrue(caso.esHora(9));
    }

    @Test
    public void casoDeUso3(){

        Caso caso = new Caso("/home/nicolas/Documentos/Algo3/algo3_tp2/algo3_tp2/Archivos/destinos.csv" , new Detective("elNovato"));
        caso.viajarAMexico();
        assertEquals("Mexico", caso.nombreDestinoActual());
        assertTrue(caso.esHora(12));

    }

    @Test
    public void casoDeUso4(){

        Caso caso = new Caso("/home/nicolas/Documentos/Algo3/algo3_tp2/algo3_tp2/Archivos/destinos.csv" , new Detective("elNovato"));
        caso.entrarAeropuerto();
        assertTrue(caso.aeropuertoMostroPista());
        assertTrue(caso.esHora(8));

        caso.entrarAeropuerto();
        assertTrue(caso.aeropuertoMostroPista());
        assertTrue(caso.esHora(10));

        caso.entrarAeropuerto();
        assertTrue(caso.aeropuertoMostroPista());
        assertTrue(caso.esHora(13));

        assertThrows(TiempoAgotadoException.class,() -> {
                for(int i = 0; i<54 ; i++) {
                    caso.entrarPuerto();
                    assertTrue(caso.aeropuertoMostroPista());
                }
            });

    }

    @Test
    public void casoDeUso5(){

        Caso caso = new Caso("/home/nicolas/Documentos/Algo3/algo3_tp2/algo3_tp2/Archivos/destinos.csv" , new Detective("elNovato"));

        caso.recibirCuchillada();
        assertTrue(caso.esHora(9));
    }

}