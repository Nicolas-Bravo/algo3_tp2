package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonAgregarDestino extends Button {
    public BotonAgregarDestino(Destino destino, Stage stage, Juego juego) {
        this.setText(destino.obtenerNombre());
        this.setOnAction(new BotonViajarACapitalEventHandler(destino, juego, stage));
        this.setAlignment(Pos.CENTER);
        this.setMaxHeight(30);
        this.setMinHeight(30);
    }
}