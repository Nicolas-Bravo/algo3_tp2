package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.handlers.BuscarSospechososEventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonBuscarSospechoso extends Button {
    public BotonBuscarSospechoso(Stage stage, Juego juego){
        this.setMaxWidth(130);
        this.setMinWidth(130);
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setText("Buscar\nSospechosos");
        this.setOnAction(new BuscarSospechososEventHandler(stage, juego));
    }

}
