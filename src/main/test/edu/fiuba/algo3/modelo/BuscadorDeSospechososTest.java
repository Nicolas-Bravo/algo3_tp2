package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class buscadorDeSospechososTest {

    @Test
    public void interpoolRecibeDescripcionDeNickBrunchYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino", "Escalar montañas", "Negro", "Aro", "Motocicleta");

        assertEquals("Nick Brunch", sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeLenBulkYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino", "Escalar montañas", "Rojo", "Tattoo", "Convertible");

        assertEquals("Len Bulk",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeIhorIhorovitchYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino", "Croquet", "Rubio", "Tattoo", "Limusina");

        assertEquals("Ihor Ihorovitch",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeFastEddieBYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino", "Croquet", "Negro", "Joyeria", "Convertible");

        assertEquals("Fast Eddie B.",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeScarGraynoltYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino", "Croquet", "Rojo", "Aro", "Limusina");

        assertEquals("Scar Graynolt",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeMereyLarocYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Femenino", "Escalar montañas", "Castaño", "Joyeria", "Limusina");

        assertEquals("Merey Laroc",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeLadyAgathaYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Femenino", "Tenis", "Rojo", "Aro", "Convertible");

        assertEquals("Lady Agatha",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeKatherineDribYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Femenino", "Escalar montañas", "Castaño", "Tattoo", "Motocicleta");

        assertEquals("Katherine Drib",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeDazzleAnieYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Femenino", "Tenis", "Rubio", "Tattoo", "Limusina");

        assertEquals("Dazzle Anie",sospechosos.get(0).nombre());

    }

    @Test
    public void interpoolRecibeDescripcionDeCarmenSandiegoYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Femenino", "Tenis", "Castaño", "Joyeria", "Convertible");

        assertEquals("Carmen Sandiego",sospechosos.get(0).nombre());

    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoRojoYEncuentraALenBUlkYScarGraynolt(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino","Rojo");

        ArrayList<Sospechoso> esperado = new ArrayList<>();
        esperado.add(new Sospechoso("Len Bulk"));
        esperado.add(new Sospechoso("Scar Graynolt"));


        assertEquals(esperado, sospechosos);
    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoYEncuentraLosCincoMasculinos(){
        ArrayList<Sospechoso> sospechosos;
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        sospechosos = buscadorDeSospechosos.buscarSospechosos("Masculino");

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
        buscadorDeSospechosos buscadorDeSospechosos = new buscadorDeSospechosos();

        assertThrows(DescripcionIngresadaErroneaError.class,() -> {
            buscadorDeSospechosos.buscarSospechosos("Gris");
        });

    }

}
