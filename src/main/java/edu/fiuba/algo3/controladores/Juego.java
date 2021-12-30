package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.manejadorEventos.BotonJugarEventHandler;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.rango.Novato;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
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

    private void jugar() {
        generarCaso();
    }

    private void generarCaso() {
        Edificio edificioInicial = new Banco(new Pista("Una pista aux"));
        Edificio puertoInicial = new Puerto(new Pista("Pista aux"));
        Destino destinoInicial = new Destino("Montreal", 45.50884, 73.5878, edificioInicial, puertoInicial);

        this.casoActual = new Caso("Fast Eddie B.", new RutaDeEscape(destinoInicial), new Tesoro("Buda de oro"));
        this.policia.asignarCaso(casoActual);
        //this.casoActual = new Caso(policia);
    }



    public void crearPolicia(String text) {
        this.policia = new Policia(text, new Novato());
        this.jugar();
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
}

