package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VentanaDestinos extends StackPane {
    public VentanaDestinos(Mapa mapa, Stage stage, Juego juego) {
        this.setMinWidth(500);
        this.setMinHeight(500);
        this.setAlignment(Pos.BOTTOM_CENTER);
        Image image = new Image("https://st3.depositphotos.com/5966606/14570/v/1600/depositphotos_145703591-stock-illustration-funny-cartoon-world-map-with.jpg");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(150);
        imgView.setFitWidth(250);
        this.getChildren().add(imgView);
        ArrayList<Destino> destinos = mapa.obtenerDestinos();
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        Label label = new Label("                    ");
        label.setAlignment(Pos.CENTER);
        for(Destino destino : destinos){
            VBox vboxAgregar = new VBox(new BotonAgregarDestino(destino, stage, juego), label);
            hbox.getChildren().add(vboxAgregar);
        }


    }
}
