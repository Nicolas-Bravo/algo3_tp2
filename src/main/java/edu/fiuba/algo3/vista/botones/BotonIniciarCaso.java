package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.handlers.BotonIniciarCasoEventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonIniciarCaso extends Button {

    public BotonIniciarCaso(Stage stage, Juego juego) {
        this.setText("Iniciar");
        this.setAlignment(Pos.CENTER);
        this.setOnAction(new BotonIniciarCasoEventHandler(stage, juego));

    }

}
