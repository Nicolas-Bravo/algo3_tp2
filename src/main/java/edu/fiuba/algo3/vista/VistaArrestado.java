package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaArrestado implements MisVistas {
    private final Juego juego;
    private final HBox hboxPrincipal;

    public VistaArrestado(Stage stage, Juego juego) {
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario();

        ContenedorIzquierda contenedorImagen = ContenedorIzquierda.deTipoImagen(juego, stage, "https://cdn.discordapp.com/attachments/912029542556790795/926323851678339072/yoqsxe.jpg");

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
        return hboxPrincipal;
    }
}
