package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

        Caso caso2 = new Caso("tesoro Nacional de Montreal",
                "femenino" , "Montereal" , new Detective("elNovato"));

        assertFalse(caso2.bancoMostroPista());

        caso2.entrarBanco();

        assertTrue(caso2.bancoMostroPista());

        assertFalse(caso2.bibliotecaMostroPista());

        caso2.entrarBiblioteca();

        assertTrue(caso2.bibliotecaMostroPista());
    }

    @Test
    public void casoDeUso3(){
        //Caso de uso 3+ Detective viaja de Montreal a México
        Caso caso3 = new Caso("tesoro Nacional de Montreal","masculino",
                "Mexico", new Detective("Francisco Monopoli") );
        caso3.viajarAMexico();
        assertEquals("Mexico", caso3.nombreDestinoActual());

    }

    @Test
    public void casoDeUso4(){
    //Caso de uso 4
        //Vista un Aeropuerto (3 veces):
        //Se despliega una pista.
        //Vista un Puerto (55 veces):
        //Se despliega una pista.

    Caso caso4 = new Caso("tesoro Nacional de Montreal","masculino",
            "Montreal", new Detective("Francisco Monopoli") );
    caso4.entrarAeropuerto();
    assertTrue(caso4.aeropuertoMostroPista());

    caso4.entrarAeropuerto();
    assertTrue(caso4.aeropuertoMostroPista());

    caso4.entrarAeropuerto();
    assertTrue(caso4.aeropuertoMostroPista());

    assertThrows(TiempoAgotadoException.class,() -> {
            for(int i = 0; i<54 ; i++) {
                caso4.entrarPuerto();
                assertTrue(caso4.aeropuertoMostroPista());
            }
        });


    }

    @Test
    public void casoDeUso5(){
    //Caso de uso 5
        //Detective sufre una herida de cuchillo.
        //Detective duerme.


    }

}