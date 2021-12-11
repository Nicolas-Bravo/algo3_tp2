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
        //2000/900 < 2.5 - Redondea para abajo
        Rango rango = new RangoNovato();
        assertEquals(2, rango.calcularTiempoPorDistancia(2000));
    }

    @Test
    public void rangoNovatoTardaDosHorasEnRecorrer1500(){
        //1500/900 > 1.5 - Redondea para arriba
        Rango rango = new RangoNovato();
        assertEquals(2, rango.calcularTiempoPorDistancia(1500));
    }

    @Test
    public void rangoDetectiveTardaCuatroHorasEnRecorrer4400(){
        Rango rango = new RangoDetective();
        assertEquals(4, rango.calcularTiempoPorDistancia(4400));
    }

    @Test
    public void rangoDetectiveTardaDosHorasEnRecorrer2500() {
        //2500/1100 < 2.5 - Redondea para abajo
        Rango rango = new RangoDetective();
        assertEquals(2, rango.calcularTiempoPorDistancia(2500));
    }

    @Test
    public void rangoDetectiveTardaDosHorasEnRecorrer2000(){
        //2000/1100 > 1.5 - Redondea para arriba
        Rango rango = new RangoDetective();
        assertEquals(2, rango.calcularTiempoPorDistancia(2000));
    }

    @Test
    public void rangoInvestigadorTardaCuatroHorasEnRecorrer5200(){
        Rango rango = new RangoInvestigador();
        assertEquals(4, rango.calcularTiempoPorDistancia(5200));
    }

    @Test
    public void rangoInvestigadorTardaDosHorasEnRecorrer3000() {
        //2500/1100 < 2.5 - Redondea para abajo
        Rango rango = new RangoInvestigador();
        assertEquals(2, rango.calcularTiempoPorDistancia(3000));
    }

    @Test
    public void rangoInvestigadorTardaDosHorasEnRecorrer2000(){
        //2000/1100 > 1.5 - Redondea para arriba
        Rango rango = new RangoInvestigador();
        assertEquals(2, rango.calcularTiempoPorDistancia(2000));
    }

    @Test
    public void rangoSargentoTardaCuatroHorasEnRecorrer6000(){
        Rango rango = new RangoSargento();
        assertEquals(4, rango.calcularTiempoPorDistancia(6000));
    }

    @Test
    public void rangoSargentoTardaDosHorasEnRecorrer3500() {
        //2500/1100 < 2.5 - Redondea para abajo
        Rango rango = new RangoSargento();
        assertEquals(2, rango.calcularTiempoPorDistancia(3500));
    }

    @Test
    public void rangoSargentoTardaDosHorasEnRecorrer2500(){
        //2000/1100 > 1.5 - Redondea para arriba
        Rango rango = new RangoSargento();
        assertEquals(2, rango.calcularTiempoPorDistancia(2500));
    }

}
