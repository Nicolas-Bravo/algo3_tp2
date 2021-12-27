package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BotonEdificiosEventHandler implements EventHandler<ActionEvent> {
    private final Mapa mapa;
    Stage stage;
    private Juego juego;

    public BotonEdificiosEventHandler(Stage stage, Juego juego, Mapa mapa) {
        this.juego = juego;
        this.stage = stage;
        this.mapa = mapa;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VentanaEdificios ventanaEdificios = new VentanaEdificios(mapa.destinoActual());
        this.stage.getScene().setRoot(new StackPane(stage.getScene().getRoot(), ventanaEdificios));

    }
}
