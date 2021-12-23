package edu.fiuba.algo3.vista;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContenedorHorario extends StackPane {

    public ContenedorHorario() {
        this.setWidth(240);
        this.setHeight(100);
        Label lugar = new Label("");
        Label hora = new Label("");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(lugar, hora);
        this.getChildren().add(vbox);
    }

}
