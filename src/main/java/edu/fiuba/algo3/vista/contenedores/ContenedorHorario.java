package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ContenedorHorario extends StackPane {

    private Juego juego;

    public ContenedorHorario() {
        this.setWidth(240);
        this.setHeight(100);
        Label lugar = new Label("Cuartel general");
        lugar.setAlignment(Pos.CENTER);
        lugar.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));
        lugar.setTextFill(Color.web("FFFFFF"));
        lugar.setPadding(new Insets(5));

        Label hora = new Label("-");
        hora.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));
        hora.setTextFill(Color.web("FFFFFF"));
        hora.setPadding(new Insets(5));
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
        lugar.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));
        lugar.setTextFill(Color.web("FFFFFF"));
        lugar.setPadding(new Insets(5));

        Label hora = new Label(juego.obtenerFechaActual());
        hora.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));
        hora.setTextFill(Color.web("FFFFFF"));
        hora.setPadding(new Insets(5));
        this.juego = juego;
        VBox vbox = new VBox(lugar, hora);
        vbox.setAlignment(Pos.CENTER);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.TOP_LEFT);

    }
}
