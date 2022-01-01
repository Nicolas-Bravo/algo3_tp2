package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.Filtro;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonEjecutarBusqueda extends Button {

    public BotonEjecutarBusqueda(Stage stage, Juego juego, ArrayList<Filtro> listaFiltros) {
        this.setMaxHeight(50);
        this.setMinHeight(50);
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.setText("Buscar");

        this.setAlignment(Pos.CENTER_RIGHT);

        this.setOnAction(new BotonEjecutarBusquedaEventHandler(stage, juego, listaFiltros));

    }


}
