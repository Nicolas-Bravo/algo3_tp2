package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VentanaEdificios extends StackPane {


    public VentanaEdificios(Destino destinoActual, Stage stage, Juego juego){
        this.setMinWidth(250);
        this.setMinHeight(150);
        Image image = new Image("https://cdn.discordapp.com/attachments/912029542556790795/926320707015704646/contInfo.png");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(150);
        imgView.setFitWidth(250);
        this.getChildren().add(imgView);
        ArrayList<Edificio> edificios = destinoActual.obtenerEdificios();
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        for(Edificio edificio : edificios){
           VBox vboxAgregar = new VBox(new BotonAgregarEdificio(edificio, stage, juego));
           hbox.getChildren().add(vboxAgregar);
        }
        this.setAlignment(Pos.CENTER);
        VBox vboxPrincipal = new VBox(hbox);
        vboxPrincipal.setAlignment(Pos.CENTER);
        this.getChildren().add(vboxPrincipal);
    }

}
