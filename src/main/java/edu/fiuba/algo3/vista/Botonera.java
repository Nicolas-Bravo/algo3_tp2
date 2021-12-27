package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Botonera extends HBox {

    public Botonera(Juego juego) {
        Mapa mapaActual = juego.mapaActual();
        //Button botonViajar = new Button("Viajar");
        BotonViajar botonViajar = new BotonViajar(mapaActual);
        //lupita
        //Button botonEdificios = new Button("Edificios");
        BotonEdificios botonEdificios = new BotonEdificios(mapaActual);
        Button botonBuscarSospechosos = new Button("Buscar sospe");
        Button botonVer = new Button("Ver");
        this.getChildren().addAll(botonEdificios, botonVer, botonViajar, botonBuscarSospechosos);
        this.setAlignment(Pos.BOTTOM_RIGHT);
    }


}
