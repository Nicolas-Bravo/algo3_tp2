package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonViajarACapitalEventHandler implements EventHandler<ActionEvent> {

    private final Destino destino;
    private final Juego juego;
    private final Stage stage;

    public BotonViajarACapitalEventHandler(Destino destino, Juego juego, Stage stage) {
        this.destino = destino;
        this.juego = juego;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.policiaViajaA(destino);
        stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, new VistaCaso(stage, juego)));
    }
}
