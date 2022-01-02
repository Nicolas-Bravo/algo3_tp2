package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.vistas.VistaCaso;
import edu.fiuba.algo3.vista.vistas.VistaInicioCaso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonIniciarCasoEventHandler implements EventHandler<ActionEvent> {
    private final Stage stage;
    private final Juego juego;

    public BotonIniciarCasoEventHandler(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, new VistaCaso(stage, juego)));
    }
}
