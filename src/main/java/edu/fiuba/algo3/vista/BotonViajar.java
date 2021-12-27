package edu.fiuba.algo3.vista;


import edu.fiuba.algo3.modelo.Mapa;
import javafx.scene.control.Button;

public class BotonViajar extends Button {

    public BotonViajar(Mapa mapa) {
        this.setText("Viajar");
        this.setWidth(32);
        this.setHeight(32);
        this.setOnAction(new BotonViajarEventHandler(mapa));
    }


}
