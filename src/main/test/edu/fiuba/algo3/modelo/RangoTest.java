package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.rangos.*;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangoTest {
    @Test
    public void rangoNovatoTardaCuatroHorasEnRecorrer3600() {
        Reloj reloj = new Reloj();
        Rango rango = new Novato();

        rango.demoraPorDistancia(3600, reloj);

        assertEquals("Lunes , 11:00", reloj.fechaActual());
    }

    @Test
    public void rangoNovatoTardaDosHorasEnRecorrer2000() {
        Reloj reloj = new Reloj();
        Rango rango = new Novato();

        rango.demoraPorDistancia(2000, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoNovatoTardaDosHorasEnRecorrer1500(){
        Reloj reloj = new Reloj();
        Rango rango = new Novato();

        rango.demoraPorDistancia(1500, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoDetectiveTardaCuatroHorasEnRecorrer4400(){
        Reloj reloj = new Reloj();
        Rango rango = new Detective();

        rango.demoraPorDistancia(4400, reloj);

        assertEquals("Lunes , 11:00", reloj.fechaActual());
    }

    @Test
    public void rangoDetectiveTardaDosHorasEnRecorrer2500() {
        Reloj reloj = new Reloj();
        Rango rango = new Detective();

        rango.demoraPorDistancia(2500, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoDetectiveTardaDosHorasEnRecorrer2000(){
        Reloj reloj = new Reloj();
        Rango rango = new Detective();

        rango.demoraPorDistancia(2000, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoInvestigadorTardaCuatroHorasEnRecorrer5200(){
        Reloj reloj = new Reloj();
        Rango rango = new Investigador();

        rango.demoraPorDistancia(5200, reloj);

        assertEquals("Lunes , 11:00", reloj.fechaActual());
    }

    @Test
    public void rangoInvestigadorTardaDosHorasEnRecorrer3000() {
        Reloj reloj = new Reloj();
        Rango rango = new Investigador();

        rango.demoraPorDistancia(3000, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoInvestigadorTardaDosHorasEnRecorrer2000(){
        Reloj reloj = new Reloj();
        Rango rango = new Investigador();

        rango.demoraPorDistancia(2000, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoSargentoTardaCuatroHorasEnRecorrer6000(){
        Reloj reloj = new Reloj();
        Rango rango = new Sargento();

        rango.demoraPorDistancia(6000, reloj);

        assertEquals("Lunes , 11:00", reloj.fechaActual());
    }

    @Test
    public void rangoSargentoTardaDosHorasEnRecorrer3500() {
        Reloj reloj = new Reloj();
        Rango rango = new Sargento();

        rango.demoraPorDistancia(3500, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

    @Test
    public void rangoSargentoTardaDosHorasEnRecorrer2500(){
        Reloj reloj = new Reloj();
        Rango rango = new Sargento();

        rango.demoraPorDistancia(2500, reloj);

        assertEquals("Lunes , 9:00", reloj.fechaActual());
    }

}
