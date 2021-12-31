package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonNuevoCaso extends Button {

    private final Stage stage;
    private final Juego juego;

    public BotonNuevoCaso(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
        this.setText("Nuevo caso");
        this.setOnAction(new BotonNuevoCasoEventHandler(stage, juego));
    }
}
