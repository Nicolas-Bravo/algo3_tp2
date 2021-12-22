package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivo;
import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BuscadorDeSospechososTest {


    ArrayList<Sospechoso> listaSospechosos = LectorArchivo.generarListaSospechososTotales();
    @Test
    public void interpoolRecibeDescripcionDeNickBrunchYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Escalar montañas"),
                new Pista("Negro"),
                new Pista("Aro"),
                new Pista("Motocicleta") );

        assertTrue(sospechosos.get(0).coincideCon("Nick Brunch"));

    }

    @Test
    public void interpoolRecibeDescripcionDeLenBulkYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Escalar montañas"),
                new Pista("Rojo"),
                new Pista("Tattoo"),
                new Pista("Convertible") );

        assertTrue(sospechosos.get(0).coincideCon("Len Bulk"));

    }

    @Test
    public void interpoolRecibeDescripcionDeIhorIhorovitchYLoEncuentra() {
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Rubio"),
                new Pista("Tattoo"),
                new Pista("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Ihor Ihorovitch"));
    }

    @Test
    public void interpoolRecibeDescripcionDeFastEddieBYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Negro"),
                new Pista("Joyeria"),
                new Pista("Convertible") );

        assertTrue(sospechosos.get(0).coincideCon("Fast Eddie B."));

    }

    @Test
    public void interpoolRecibeDescripcionDeScarGraynoltYLoEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Rojo") ,
                new Pista("Aro"),
                new Pista("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Scar Graynolt"));

    }

    @Test
    public void interpoolRecibeDescripcionDeMereyLarocYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Femenino"),
                new Pista("Escalar montañas"),
                new Pista("Castaño"),
                new Pista("Joyeria"),
                new Pista("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Merey Laroc"));

    }

    @Test
    public void interpoolRecibeDescripcionDeLadyAgathaYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Femenino"),
                new Pista("Tenis"),
                new Pista("Rojo") ,
                new Pista("Aro"),
                new Pista("Convertible"));

        assertTrue(sospechosos.get(0).coincideCon("Lady Agatha"));

    }

    @Test
    public void interpoolRecibeDescripcionDeKatherineDribYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Femenino"),
                new Pista("Escalar montañas"),
                new Pista("Castaño"),
                new Pista("Tattoo"),
                new Pista("Motocicleta") );

        assertTrue(sospechosos.get(0).coincideCon("Katherine Drib"));

    }

    @Test
    public void interpoolRecibeDescripcionDeDazzleAnieYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Femenino"),
                new Pista("Tenis"),
                new Pista("Rubio"),
                new Pista("Tattoo"),
                new Pista("Limusina") );

        assertTrue(sospechosos.get(0).coincideCon("Dazzle Anie"));

    }

    @Test
    public void interpoolRecibeDescripcionDeCarmenSandiegoYLaEncuentra(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Femenino"),
                new Pista("Tenis"),
                new Pista("Castaño"),
                new Pista("Joyeria"),
                new Pista("Convertible"));

        assertTrue(sospechosos.get(0).coincideCon("Carmen Sandiego"));

    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoRojoYEncuentraALenBUlkYScarGraynolt(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos,
                new Pista("Masculino"),
                new Pista("Rojo") );

        ArrayList<Sospechoso> esperado = new ArrayList<>();
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Len Bulk", listaSospechosos));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Scar Graynolt", listaSospechosos));


        assertEquals(esperado, sospechosos);
    }

    @Test
    public void interpolRecibeUnaDescripcionMasculinoYEncuentraLosCincoMasculinos(){
        ArrayList<Sospechoso> sospechosos;

        sospechosos = BuscadorDeSospechosos.buscarSospechosos(listaSospechosos, new Pista("Masculino"));

        ArrayList<Sospechoso> esperado = new ArrayList<>();
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Nick Brunch", listaSospechosos));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Len Bulk", listaSospechosos));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Ihor Ihorovitch", listaSospechosos));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Fast Eddie B.", listaSospechosos));
        esperado.add(BuscadorDeSospechosos.obtenerSospechosoPorNombre("Scar Graynolt", listaSospechosos));

        assertEquals(esperado, sospechosos);
        assertEquals(5,sospechosos.size());

    }

    @Test
    public void interpolRecibeUnaDescrpcionGrisYGeneraDescripcionINgresadaErroneaError(){
        assertThrows(DescripcionIngresadaErroneaError.class,() -> {
            BuscadorDeSospechosos.buscarSospechosos(listaSospechosos, new Pista("Gris") );
        });

    }

}
