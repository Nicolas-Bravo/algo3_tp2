package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonEjecutarBusqueda extends Button {

    public BotonEjecutarBusqueda(Stage stage, Juego juego, ArrayList<Filtro> listaFiltros) {
        this.setMaxHeight(70);
        this.setMinHeight(70);
        this.setMaxWidth(100);
        this.setMinWidth(100);

        this.setAlignment(Pos.CENTER);

        this.setOnAction(new BotonEjecutarBusquedaEventHandler(stage, juego, listaFiltros));

    }


}
