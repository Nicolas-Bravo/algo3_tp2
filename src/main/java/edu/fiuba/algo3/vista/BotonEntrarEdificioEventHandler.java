package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonEntrarEdificioEventHandler implements EventHandler<ActionEvent> {
    private final Edificio edificio;
    private final Stage stage;
    private Juego juego;

    public BotonEntrarEdificioEventHandler(Edificio edificio, Stage stage, Juego juego) {
        this.edificio = edificio;
        this.stage = stage;
        this.juego = juego;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        VistaEdificio vistaEdificio = new VistaEdificio(stage, juego, edificio);
        this.stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, vistaEdificio));
        vistaEdificio.checkeoFinDelCaso();

    }
}
