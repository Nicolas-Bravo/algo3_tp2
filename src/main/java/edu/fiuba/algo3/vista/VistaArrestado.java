package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaArrestado implements MisVistas {
    private final Juego juego;
    private final HBox hboxPrincipal;

    public VistaArrestado(Stage stage, Juego juego) {
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario();

        ContenedorIzquierda contenedorImagen = ContenedorIzquierda.deTipoImagen(juego, stage, "https://cdn3.vectorstock.com/i/1000x1000/27/87/cartoon-criminal-in-jail-vector-21352787.jpg");

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorImagen);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);
        contenedorInfo.infoFinal();

        VBox vboxLateralDerecha = new VBox(contenedorInfo);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    @Override
    public Node componentePrincipal() {
        return new StackPaneFondoNegro(hboxPrincipal);
    }
}
