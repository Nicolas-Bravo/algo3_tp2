package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class ContenedorInformacion extends StackPane {

    public ContenedorInformacion(Juego juego) {
        this.setWidth(500);
        this.setHeight(900);

        Image image = new Image("https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(500);
        imgView.setFitWidth(700);

        Label infoActual = new Label("Info de la capital");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(imgView, infoActual);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.TOP_RIGHT);
    }

}
