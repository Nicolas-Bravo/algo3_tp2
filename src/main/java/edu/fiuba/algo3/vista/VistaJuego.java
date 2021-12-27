package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaJuego implements MisVistas {
    private Juego juego;
    //private Canvas canvas;
    private HBox hboxPrincipal;
    public VistaJuego(Juego juego, Stage stage) {
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario();

        ContenedorTipeadora contenedorTipeadora = new ContenedorTipeadora(juego, stage);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorTipeadora);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);
        vboxLateralIzquierda.prefWidthProperty().bind(stage.widthProperty().multiply(0.40));
        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego);

        VBox vboxLateralDerecha = new VBox(contenedorInfo);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);
        vboxLateralDerecha.prefWidthProperty().bind(stage.widthProperty().multiply(0.60));

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    public Node componentePrincipal() {
        return new StackPane(this.hboxPrincipal);
    }
    public void actualizarVista() {
    }
}
