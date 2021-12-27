package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class ContenedorImagen extends StackPane {

    public ContenedorImagen(Juego juego){
        this.setWidth(240);
        this.setHeight(500);

        Image image = new Image(juego.imagenCapitalActual());
        ImageView imgView = new ImageView(image);



        this.getChildren().add(imgView);
        this.setAlignment(Pos.CENTER_LEFT);
    }



}
