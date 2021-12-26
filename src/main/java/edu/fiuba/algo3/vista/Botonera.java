package edu.fiuba.algo3.vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Botonera extends HBox {

    public Botonera() {
        Button botonViajar = new Button("Viajar");
        //lupita
        Button botonEdificios = new Button("Edificios");
        Button botonBuscarSospechosos = new Button("Buscar sospe");
        Button botonVer = new Button("Ver");
        this.getChildren().addAll(botonEdificios, botonVer, botonViajar, botonBuscarSospechosos);
        this.setAlignment(Pos.BOTTOM_RIGHT);
    }


}
