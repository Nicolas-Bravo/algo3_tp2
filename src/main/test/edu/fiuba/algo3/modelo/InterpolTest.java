package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class InterpolTest {
    @Test
    public void interpolRecibeUnaListaDeSospechosoConDosResultados(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino","Rojo");

        assertEquals("Len Bulk",sospechosos.get(0));
        assertEquals("Fast Eddie B.",sospechosos.get(1));

    }

    @Test
    public void interpolRecibeUnaListaDeSospechosoConCincoResultados(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino");
        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("Nick Brunch");
        esperado.add("Len Bulk");
        esperado.add("Ihor Ihorovitch");
        esperado.add("Fast Eddie B.");
        esperado.add("Scar Graynolt");

        assertEquals(esperado, sospechosos);
        assertEquals(5,sospechosos.size());

    }

    @Test
    public void interpolRecibeUnaListaDeSospechosoSinResultados(){

        assertThrows(DescripcionIngresadaErroneaError.class,() -> {
            Interpol.buscarSospechosos("Gris");
        });

    }
}
