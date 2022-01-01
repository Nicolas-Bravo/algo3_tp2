package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.parents.VBoxControlesFiltro;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ContenedorBusquedaSospechosos extends StackPane {
    private final Juego juego;

    public ContenedorBusquedaSospechosos(Stage stage, Juego juego) {
        this.juego = juego;
        Image image = new Image("https://cdn.discordapp.com/attachments/912029542556790795/926320707015704646/contInfo.png");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(500);
        imgView.setFitWidth(500);
        VBoxControlesFiltro vboxPrincipal = new VBoxControlesFiltro(stage, juego);
        this.getChildren().addAll(imgView, vboxPrincipal);
    }
}
