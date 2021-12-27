package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaEdificio implements MisVistas {
    private final HBox hboxPrincipal;
    //Cambiar contenedor info por edificio
    public VistaEdificio(Stage stage, Juego juego) {
        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);

        ContenedorImagen contenedorImagen = new ContenedorImagen(juego);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorImagen);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_RIGHT);
        VBox vboxLateralDerecha = new VBox(contenedorInfo, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    public Node componentePrincipal() {
        return new StackPane(this.hboxPrincipal);
    }

}
