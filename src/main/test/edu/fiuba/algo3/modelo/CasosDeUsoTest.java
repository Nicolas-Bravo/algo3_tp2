package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.exceptions.TiempoAgotadoException;
import static org.junit.jupiter.api.Assertions.*;

public class CasosDeUsoTest {

    @Test
    public void detectiveCargaDatosEnComputadorYBuscaSospechosos(){
        Detective detective = new Detective("Alberto");

        detective.buscarEnComputadora("Rojo", "Convertible");


}
}
