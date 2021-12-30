package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BuscadorDeSospechososTest {


    @Test
    public void interpoolRecibeDescripcionDeNickBrunchYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Escalar montañas"),
                new PistaGeneral("Negro"),
                new PistaGeneral("Aro"),
                new PistaGeneral("Motocicleta") );

        assertTrue(sospechosos.get(0).coincideCon("Nick Brunch"));

    }

    @Test
    public void interpoolRecibeDescripcionDeLenBulkYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Escalar montañas"),
                new PistaGeneral("Rojo"),
                new PistaGeneral("Tattoo"),
                new PistaGeneral("Convertible") );

        assertTrue(sospechosos.get(0).coincideCon("Len Bulk"));

    }

    @Test
    public void interpoolRecibeDescripcionDeIhorIhorovitchYLoEncuentra() {
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Rubio"),
                new PistaGeneral("Tattoo"),
                new PistaGeneral("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Ihor Ihorovitch"));
    }

    @Test
    public void interpoolRecibeDescripcionDeFastEddieBYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Negro"),
                new PistaGeneral("Joyeria"),
                new PistaGeneral("Convertible") );

        assertTrue(sospechosos.get(0).coincideCon("Fast Eddie B."));

    }

    @Test
    public void interpoolRecibeDescripcionDeScarGraynoltYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Rojo") ,
                new PistaGeneral("Aro"),
                new PistaGeneral("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Scar Graynolt"));

    }

    @Test
    public void interpoolRecibeDescripcionDeMereyLarocYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Femenino"),
                new PistaGeneral("Escalar montañas"),
                new PistaGeneral("Castaño"),
                new PistaGeneral("Joyeria"),
                new PistaGeneral("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Merey Laroc"));

    }

    @Test
    public void interpoolRecibeDescripcionDeLadyAgathaYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Femenino"),
                new PistaGeneral("Tenis"),
                new PistaGeneral("Rojo") ,
                new PistaGeneral("Aro"),
                new PistaGeneral("Convertible"));

        assertTrue(sospechosos.get(0).coincideCon("Lady Agatha"));

    }

    @Test
    public void interpoolRecibeDescripcionDeKatherineDribYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Femenino"),
                new PistaGeneral("Escalar montañas"),
                new PistaGeneral("Castaño"),
                new PistaGeneral("Tattoo"),
                new PistaGeneral("Motocicleta") );

        assertTrue(sospechosos.get(0).coincideCon("Katherine Drib"));

    }

    @Test
    public void interpoolRecibeDescripcionDeDazzleAnieYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Femenino"),
                new PistaGeneral("Tenis"),
                new PistaGeneral("Rubio"),
                new PistaGeneral("Tattoo"),
                new PistaGeneral("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Dazzle Anie"));

    }

    @Test
    public void interpoolRecibeDescripcionDeCarmenSandiegoYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Femenino"),
                new PistaGeneral("Tenis"),
                new PistaGeneral("Castaño"),
                new PistaGeneral("Joyeria"),
                new PistaGeneral("Convertible"));

        assertTrue(sospechosos.get(0).coincideCon("Carmen Sandiego"));

    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoRojoYEncuentraALenBUlkYScarGraynolt(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Rojo") );

        ArrayList<Sospechoso> esperado = new ArrayList<>();
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Len Bulk"));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Scar Graynolt"));


        assertEquals(esperado, sospechosos);
    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoYEncuentraLosCincoMasculinos(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos( new PistaGeneral("Masculino"));

        ArrayList<Sospechoso> esperado = new ArrayList<>();
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Nick Brunch"));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Len Bulk"));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Ihor Ihorovitch"));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Fast Eddie B."));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Scar Graynolt"));

        assertEquals(esperado, sospechosos);
        assertEquals(5,sospechosos.size());

    }

    @Test
    public void interpolRecibeUnaDescrpcionGrisYGeneraDescripcionINgresadaErroneaError(){
        assertThrows(DescripcionIngresadaErroneaError.class,() -> {
            BuscadorDeSospechosos.buscarSospechosos( new PistaGeneral("Gris") );
        });

    }

}
