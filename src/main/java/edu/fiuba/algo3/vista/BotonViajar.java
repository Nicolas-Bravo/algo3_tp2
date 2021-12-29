package edu.fiuba.algo3.vista;


import edu.fiuba.algo3.modelo.Mapa;
import javafx.scene.control.Button;

public class BotonViajar extends Button {

    public BotonViajar(Mapa mapa) {
        this.setText("Viajar");
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setOnAction(new BotonViajarEventHandler(mapa));
    }


}
