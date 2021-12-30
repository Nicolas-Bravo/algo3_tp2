package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        ContenedorIzquierda contenedorIzquierda = new ContenedorIzquierda(juego, stage);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorIzquierda);
        vboxLateralIzquierda.setAlignment(Pos.CENTER);
        vboxLateralIzquierda.prefWidthProperty().bind(stage.widthProperty().multiply(0.40));



        this.hboxPrincipal = new HBox(vboxLateralIzquierda);
        hboxPrincipal.setAlignment(Pos.CENTER);
    }

    public Node componentePrincipal() {

        StackPane stackPane = new StackPane();
        Image image = new Image("https://steamuserimages-a.akamaihd.net/ugc/964222570049007380/6AF5BAF971AF3A5FB8912D797D5CBD4BC73A2EB0/");
        ImageView imgView = new ImageView(image);
        stackPane.getChildren().addAll(imgView,hboxPrincipal);
        return stackPane;
    }
    public void actualizarVista() {
    }
}
