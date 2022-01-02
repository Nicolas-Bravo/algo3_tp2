package edu.fiuba.algo3.vista.handlers;

import edu.fiuba.algo3.vista.contenedores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.vistas.VistaInicioCaso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonNuevoCasoEventHandler implements EventHandler<ActionEvent> {
    private final Juego juego;
    private final Stage stage;

    public BotonNuevoCasoEventHandler(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.juego.jugar();
        stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, new VistaInicioCaso(stage, juego)));
    }
}
