package edu.fiuba.algo3.vista.botones;


import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonViajar extends Button {

    public BotonViajar(Mapa mapa, Juego juego, Stage stage) {
        this.setText("Viajar");
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setOnAction(new BotonViajarEventHandler(mapa, juego, stage));
    }


}
