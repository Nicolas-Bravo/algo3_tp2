package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonBuscarSospechoso extends Button {
    public BotonBuscarSospechoso(Stage stage, Juego juego){
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setText("Buscar\nSospechosos");
        this.setOnAction(new BuscarSospechososEventHandler(stage, juego));
    }

}
