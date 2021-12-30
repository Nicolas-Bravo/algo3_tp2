package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonEdificios extends Button {

    public BotonEdificios(Stage stage, Juego juego,Mapa mapa) {
        this.setText("Edificios");
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setOnAction(new BotonEdificiosEventHandler(stage,juego,mapa));
    }


}
