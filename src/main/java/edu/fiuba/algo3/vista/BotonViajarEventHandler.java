package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {

    private final Stage stage;
    private final Juego juego;
    private final Mapa mapa;

    public BotonViajarEventHandler(Mapa mapa, Juego juego, Stage stage) {
        this.mapa = mapa;
        this.juego = juego;
        this.stage = stage;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        VentanaDestinos ventanaDestinos = new VentanaDestinos(mapa, stage, juego);
        this.stage.getScene().setRoot(new StackPane(stage.getScene().getRoot(), ventanaDestinos));
    }
}
