package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.LectorArchivoPolicia;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

import java.util.ArrayList;

public class Caso {

    private final RutaDeEscape rutaDeEscape;
    private final Sospechoso ladronReal;
    private boolean orden;
    private final Tesoro tesoro;
    private boolean terminado;

    public Caso(PistaGeneral nombre, Tesoro tesoro_p, RutaDeEscape ruta){
        this.ladronReal = BuscadorDeSospechosos.obtenerSospechosoPorNombre(nombre.mostrarPista());
        this.rutaDeEscape = ruta;
        this.orden = false;
        this.tesoro = tesoro_p;
        this.terminado = false;
    }

    public void emitirOrden(Sospechoso sospechoso){
        if(this.ladronReal.coincideCon(sospechoso)){
            this.orden = true;
        }
    }

    public void arresteSospechoso(Policia policia) {
        if (orden) {
            policia.sumarArresto();
            LectorArchivoPolicia.aumentarArresto(policia);
        }
        terminado = true;
    }

    public ArrayList<Sospechoso> buscarSospechosos(Pista[] datos) {
        return BuscadorDeSospechosos.buscarSospechosos( datos);
    }

    public void controlArresto(Destino destinoActual, Pista pista, Policia policia) {
        this.rutaDeEscape.controlArresto(destinoActual, pista, policia, this);
    }

    public Mapa obtenerMapa() {
        return this.rutaDeEscape.obtenerMapa();
    }

    public boolean estaTerminado() {
        return this.terminado;
    }

    public String obtenerTextoFinal() {
        String texto = "Atrapaste al culpable pero al no haber emitido \n una orden, no se lo puede arrestar";
        if (terminado && orden) {
            texto = "Al haber emitido la orden antes de atrapar, sumas un arresto!\n";
        }
        return texto;
    }

    public String sospechosoReal() {
        return ladronReal.nombreDelSospechoso();
    }

    public String obtenerNombreTesoro() {
        return this.tesoro.obtenerNombre();
    }

    public String generoLadron() {
        return this.ladronReal.obtenerGenero();
    }
}
