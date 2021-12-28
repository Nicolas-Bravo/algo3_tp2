package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Aeropuerto;
import edu.fiuba.algo3.modelo.Banco;
import edu.fiuba.algo3.modelo.Biblioteca;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.*;

public class CreadorEdificios {

    public Edificio obtenerEdificio(Pista pista) {
        return pista.obtenerEdificio();
    }
}
