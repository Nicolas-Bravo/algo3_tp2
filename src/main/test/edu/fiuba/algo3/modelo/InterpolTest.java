package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class InterpolTest {

    @Test
    public void interpoolRecibeDescripcionDeNickBrunchYLoEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino", "Escalar montañas", "Negro", "Aro", "Motocicleta");

        assertEquals("Nick Brunch",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeLenBulkYLoEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino", "Escalar montañas", "Rojo", "Tattoo", "Convertible");

        assertEquals("Len Bulk",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeIhorIhorovitchYLoEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino", "Croquet", "Rubio", "Tattoo", "Limusina");

        assertEquals("Ihor Ihorovitch",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeFastEddieBYLoEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino", "Croquet", "Negro", "Joyeria", "Convertible");

        assertEquals("Fast Eddie B.",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeScarGraynoltYLoEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino", "Croquet", "Rojo", "Aro", "Limusina");

        assertEquals("Scar Graynolt",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeMereyLarocYLaEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Femenino", "Escalar montañas", "Castaño", "Joyeria", "Limusina");

        assertEquals("Merey Laroc",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeLadyAgathaYLaEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Femenino", "Tenis", "Rojo", "Aro", "Convertible");

        assertEquals("Lady Agatha",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeKatherineDribYLaEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Femenino", "Escalar montañas", "Castaño", "Tattoo", "Motocicleta");

        assertEquals("Katherine Drib",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeDazzleAnieYLaEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Femenino", "Tenis", "Rubio", "Tattoo", "Limusina");

        assertEquals("Dazzle Anie",sospechosos.get(0));

    }

    @Test
    public void interpoolRecibeDescripcionDeCarmenSandiegoYLaEncuentra(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Femenino", "Tenis", "Castaño", "Joyeria", "Convertible");

        assertEquals("Carmen Sandiego",sospechosos.get(0));

    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoRojoYEncuentraALenBUlkYScarGraynolt(){
        ArrayList<String> sospechosos;

        sospechosos = Interpol.buscarSospechosos("Masculino","Rojo");

        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("Len Bulk");
        esperado.add("Scar Graynolt");


        assertEquals(esperado, sospechosos);
    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoYEncuentraLosCincoMasculinos(){
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
    public void interpolRecibeUnaDescrpcionGrisYGeneraDescripcionINgresadaErroneaError(){

        assertThrows(DescripcionIngresadaErroneaError.class,() -> {
            Interpol.buscarSospechosos("Gris");
        });

    }

}
