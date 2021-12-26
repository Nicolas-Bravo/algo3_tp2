package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class ContenedorImagen extends StackPane {

    public ContenedorImagen(Juego juego){
        this.setWidth(240);
        this.setHeight(500);

        Image image = new Image(juego.imagenCapitalActual());
        BackgroundImage imagenFondo = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenFondo));

        this.setAlignment(Pos.CENTER_LEFT);
    }



}
