package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContenedorHorario extends StackPane {

    public ContenedorHorario() {
        this.setWidth(240);
        this.setHeight(100);
        Label lugar = new Label("Cuartel general");
        lugar.setAlignment(Pos.CENTER);

        Label hora = new Label("-");
        hora.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(lugar, hora);
        vbox.setAlignment(Pos.CENTER);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.TOP_LEFT);
    }

    public ContenedorHorario(Juego juego) {
        this.setWidth(240);
        this.setHeight(100);
        Label lugar = new Label(juego.nombreDestinoActual());
        Label hora = new Label(juego.obtenerFechaActual());
    }
}
