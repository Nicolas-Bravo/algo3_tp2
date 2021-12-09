package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangoTest {
    @Test
    public void rangoNovatoTardaCuatroHorasEnRecorrer3600() {
        Rango rango = new RangoNovato();
        assertEquals(4, rango.calcularTiempoPorDistancia(3600));
    }

    @Test
    public void rangoNovatoTardaDosHorasEnRecorrer2000() {
        Rango rango = new RangoNovato();
        assertEquals(2, rango.calcularTiempoPorDistancia(2000));
    }

    @Test
    public void rangoNovatoDosHorasEnRecorrer1500(){
        Rango rango = new RangoNovato();
        assertEquals(2, rango.calcularTiempoPorDistancia(1500));
    }

    @Test
    public void rangoDetectiveTardaCuatroHorasEnRecorrer4400(){
        Rango rango = new RangoDetective();
        assertEquals(4, rango.calcularTiempoPorDistancia(4400));
    }

    @Test
    public void rangoInvestigadorTardaCuatroHorasEnRecorrer5200(){
        Rango rango = new RangoInvestigador();
        assertEquals(4, rango.calcularTiempoPorDistancia(5200));
    }

    @Test
    public void rangoSargentoTardaCuatroHorasEnRecorrer6000(){
        Rango rango = new RangoSargento();
        assertEquals(4, rango.calcularTiempoPorDistancia(6000));
    }

}
