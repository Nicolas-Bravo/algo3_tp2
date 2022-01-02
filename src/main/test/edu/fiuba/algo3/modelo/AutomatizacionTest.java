package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.buscadores.BuscadorDeDestinos;
import edu.fiuba.algo3.modelo.buscadores.BuscadorDeSospechosos;
import edu.fiuba.algo3.modelo.buscadores.BuscadorDeTesoros;
import edu.fiuba.algo3.modelo.core.Policia;
import edu.fiuba.algo3.modelo.core.RutaDeEscape;
import edu.fiuba.algo3.modelo.core.Sospechoso;
import edu.fiuba.algo3.modelo.core.Tesoro;
import edu.fiuba.algo3.modelo.rangos.*;
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
    public void buscadorDeDestinosRecibeUnTesoroComunYDaUnaRutaDeEscapeDeCincoDestinos(){

        Sospechoso sospechoso = BuscadorDeSospechosos.buscarSospechosoAleatorio();

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Novato());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro, sospechoso);

        assertEquals(5, ruta.largo());
    }


    @Test
    public void buscadorDeDestinosRecibeUnTesoroValiosoYDaUnaRutaDeEscapeDeSeisDestinos(){

        Sospechoso sospechoso = BuscadorDeSospechosos.buscarSospechosoAleatorio();

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Detective());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro, sospechoso);

        assertEquals(6, ruta.largo());
    }


    @Test
    public void buscadorDeDestinosRecibeUnTesoroMuyValiosoYDaUnaRutaDeEscapeDeOchoDestinos(){

        Sospechoso sospechoso = BuscadorDeSospechosos.buscarSospechosoAleatorio();

        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(new Sargento());

        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro, sospechoso);

        assertEquals(8, ruta.largo());
    }
}
