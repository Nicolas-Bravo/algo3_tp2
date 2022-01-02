package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.archivos.LectorArchivoPolicia;
import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.rangos.Novato;

import javafx.stage.Stage;

import java.util.List;

public class Juego {

    private Policia policia;
    private Caso casoActual;
    private List<Sospechoso> listaSospechosos;
    private List<Tesoro> listaBotines;
    private List<Destino> listaDestinos;
    private Stage stageActual;

    public Juego(Stage stage){
        generarListasDeDatos();
        this.stageActual = stage;
    }

    private void generarListasDeDatos() {
        listaSospechosos = BuscadorDeSospechosos.obtenerSospechososTotales();
    }

    public void jugar() {
        generarCaso();
    }

    private void generarCaso() {
        Tesoro tesoro = BuscadorDeTesoros.obtenerTesoroAleatorioAleatorio(policia.obtenerRango());
        Sospechoso sospe = BuscadorDeSospechosos.buscarSospechosoAleatorio();
        RutaDeEscape ruta = BuscadorDeDestinos.obtenerRutaDeEscape(tesoro, sospe);
        for (Destino d: ruta.destinos) {
            System.out.println(d);
        }
        this.casoActual = new Caso(new PistaGeneral(sospe.nombreDelSospechoso()), tesoro, ruta);
        System.out.println(casoActual.sospechosoReal());
        this.policia.asignarCaso(casoActual);
    }



    public void crearPolicia(String text) {
        buscarPoliciaEnRegistro(text);
        this.jugar();
    }

    private void buscarPoliciaEnRegistro(String text) {
        this.policia = LectorArchivoPolicia.buscarPoliciaPorNombre(text);
    }

    public String nombreDestinoActual() {
        return policia.destinoActual().toString();
    }

    public String obtenerFechaActual() {
        return policia.fechaActual();
    }

    public String imagenCapitalActual() {
        return policia.enlaceCapitalActual();
    }

    public Mapa mapaActual() {
        return policia.mapaActual();
    }

    public Pista entrarA(Edificio edificio) { return policia.entrar(edificio); }

    public List<Sospechoso> obtenerListaSospechosos() { return listaSospechosos; }

    public void policiaViajaA(Destino destino) {
        policia.viajar(destino);
    }

    public boolean casoTerminado() {
        return casoActual.estaTerminado();
    }

    public String tituloPolicia() {
        return policia.titulo();
    }

    public String textoJugadorGano() {
        return casoActual.obtenerTextoFinal() + "\nTienes un total de " + policia.cantidadDeArrestos() + " arrestos";
    }

    public void emitirOrden(Pista... pistas) {
        this.policia.emitirOrdenDeArresto(pistas);
    }

    public String nombreTesoroActual() {
        return this.casoActual.obtenerNombreTesoro();

    }

    public String generoLadron() {
        return this.casoActual.generoLadron();
    }
}

