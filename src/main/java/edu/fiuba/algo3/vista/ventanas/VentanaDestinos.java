package edu.fiuba.algo3.vista.ventanas;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaDestinos extends VBox {
    public VentanaDestinos(Mapa mapa, Stage stage, Juego juego) {
        this.setMinWidth(500);
        this.setMinHeight(500);
        this.setAlignment(Pos.BOTTOM_CENTER);

        VentanaOpcionesDestinos ventanaOpciones = new VentanaOpcionesDestinos(mapa, stage, juego);


        Image image = new Image("https://st3.depositphotos.com/5966606/14570/v/1600/depositphotos_145703591-stock-illustration-funny-cartoon-world-map-with.jpg");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(350);
        imgView.setFitWidth(750);
        this.getChildren().addAll(ventanaOpciones, imgView);
    }
}
