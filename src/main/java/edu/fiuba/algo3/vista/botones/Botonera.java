package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.core.Mapa;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Botonera extends HBox {

    public Botonera(Stage stage, Juego juego) {
        Mapa mapaActual = juego.mapaActual();
        //Button botonViajar = new Button("Viajar");
        BotonViajar botonViajar = new BotonViajar(mapaActual, juego, stage);
        //lupita
        //Button botonEdificios = new Button("Edificios");
        BotonEdificios botonEdificios = new BotonEdificios(stage,juego,mapaActual);
        BotonBuscarSospechoso botonBuscarSospechosos = new BotonBuscarSospechoso(stage, juego);
        this.getChildren().addAll(botonEdificios, botonViajar, botonBuscarSospechosos);
        this.setAlignment(Pos.BOTTOM_RIGHT);
    }


}
