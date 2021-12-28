package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.rango.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AutomatizacionTest {

    @Test
    public void buscadorDeTesorosRecibeUnNovatoYDaUnTesoroDeValorComun() throws ClassNotFoundException {
        Policia poli = new Policia("Franco", new Novato());

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(poli.obtenerRango());

        assertTrue( Class.forName("edu.fiuba.algo3.modelo.valor.Comun").isInstance(tesoro.obtenerValor()));
    }


    @Test
    public void buscadorDeTesorosRecibeUnDetectiveYDaUnTesoroDeValorValioso() throws ClassNotFoundException {
        Policia poli = new Policia("Franco", new Detective());

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(poli.obtenerRango());

        assertTrue( Class.forName("edu.fiuba.algo3.modelo.valor.Valioso").isInstance(tesoro.obtenerValor()));
    }

    @Test
    public void buscadorDeTesorosRecibeUnInvestigadorYDaUnTesoroDeValorValioso() throws ClassNotFoundException {
        Policia poli = new Policia("Franco", new Investigador());

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(poli.obtenerRango());

        assertTrue( Class.forName("edu.fiuba.algo3.modelo.valor.Valioso").isInstance(tesoro.obtenerValor()));
    }

    @Test
    public void buscadorDeTesorosRecibeUnSargentoYDaUnTesoroDeValorMuyValioso() throws ClassNotFoundException {
        Policia poli = new Policia("Franco", new Sargento());

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(poli.obtenerRango());

        assertTrue( Class.forName("edu.fiuba.algo3.modelo.valor.MuyValioso").isInstance(tesoro.obtenerValor()));
    }

    @Test
    public void buscadorDeDestinosRecibeUnTesoroComunYDaUnaRutaDeEscapeDeCuatroDestinos(){
        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Novato());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro);

        assertEquals(4, ruta.largo());
    }


    @Test
    public void buscadorDeDestinosRecibeUnTesoroValiosoYDaUnaRutaDeEscapeDeCincoDestinos(){
        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Detective());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro);

        assertEquals(5, ruta.largo());
    }


    @Test
    public void buscadorDeDestinosRecibeUnTesoroMuyValiosoYDaUnaRutaDeEscapeDeSieteDestinos(){
        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Sargento());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro);

        assertEquals(7, ruta.largo());
    }
}
