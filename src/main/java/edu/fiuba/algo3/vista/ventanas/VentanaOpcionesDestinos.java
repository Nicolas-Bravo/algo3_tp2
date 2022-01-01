package edu.fiuba.algo3.vista.ventanas;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.Mapa;
import edu.fiuba.algo3.vista.botones.BotonAgregarDestino;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VentanaOpcionesDestinos extends StackPane {
    public VentanaOpcionesDestinos(Mapa mapa, Stage stage, Juego juego) {
        VBox vbox = new VBox();
        ArrayList<Destino> destinos = mapa.destinoActual().destinosPosibles();
        for(Destino destino : destinos){
            vbox.getChildren().add(new BotonAgregarDestino(destino, stage, juego));
        }
        Image img = new Image("https://wallpaper.dog/large/10921188.jpg");
        ImageView imgView = new ImageView(img);
        imgView.setFitWidth(300);
        imgView.setFitHeight(vbox.getChildren().size() * 45);
        vbox.setAlignment(Pos.CENTER);
        this.getChildren().addAll(imgView, vbox);
    }
}
