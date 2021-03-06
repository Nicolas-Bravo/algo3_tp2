package edu.fiuba.algo3.vista.handlers;

import edu.fiuba.algo3.vista.contenedores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.buscadores.BuscadorDeSospechosos;
import edu.fiuba.algo3.modelo.core.Sospechoso;
import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.vista.controles.polilla.Filtro;
import edu.fiuba.algo3.vista.vistas.VistaResultado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

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
        ArrayList<Pista> conjuntoPistas = new ArrayList<>();
        ArrayList<Sospechoso> sospechososPosibles = new ArrayList<>();

        for(Filtro filtro: filtros) {
            Pista pistaActual = filtro.obtenerPista();
            if (pistaActual != null && !pistaActual.mostrarPista().equals("")) {
                conjuntoPistas.add(pistaActual);
            }
        }
        conjuntoPistas.removeIf(Objects::isNull);
        try {
            sospechososPosibles = BuscadorDeSospechosos.buscarSospechosos(conjuntoPistas.toArray(new Pista[0]));
        }
        catch (DescripcionIngresadaErroneaError e){
            sospechososPosibles = new ArrayList<>();
        }
        if (sospechososPosibles.size() == 1) {
            juego.emitirOrden(conjuntoPistas.toArray(new Pista[0]));
        }
        VistaResultado vistaResultados = new VistaResultado(stage, juego, sospechososPosibles);
        this.stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, vistaResultados));

        //acomodar vista
    }
}
