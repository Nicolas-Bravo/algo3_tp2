package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Sospechoso;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VistaResultado implements MisVistas {
    private final HBox hboxPrincipal;

    public VistaResultado(Stage stage, Juego juego, ArrayList<Sospechoso> sospechosos) {
        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);

        ContenedorSospechosos contenedorSospe = new ContenedorSospechosos(juego, stage, sospechosos);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorSospe);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_CENTER);
        VBox vboxLateralDerecha = new VBox(contenedorInfo, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    @Override
    public Node componentePrincipal() {
        return new StackPane(hboxPrincipal);
    }
}
