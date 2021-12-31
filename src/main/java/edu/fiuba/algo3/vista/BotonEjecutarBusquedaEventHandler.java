package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.BuscadorDeSospechosos;
import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonEjecutarBusquedaEventHandler implements EventHandler<ActionEvent> {
    private final Stage stage;
    private final Juego juego;
    private final ArrayList<Filtro> filtros;

    public BotonEjecutarBusquedaEventHandler(Stage stage, Juego juego, ArrayList<Filtro> filtros) {
        this.juego = juego;
        this.stage = stage;
        this.filtros = filtros;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Pista[] conjuntoPistas = new Pista[filtros.size()];
        for(Filtro filtro: filtros) {
            conjuntoPistas[filtros.indexOf(filtro)] = filtro.obtenerPista();
        }
        VistaResultado vistaResultados = new VistaResultado(stage, juego, BuscadorDeSospechosos.buscarSospechosos(conjuntoPistas));
        //acomodar vista
    }
}
