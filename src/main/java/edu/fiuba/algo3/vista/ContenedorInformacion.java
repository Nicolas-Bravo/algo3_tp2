package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class ContenedorInformacion extends StackPane {

    public ContenedorInformacion(Juego juego) {
        this.setWidth(240);
        this.setHeight(900);

        Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Black_from_a_camera.jpg/1200px-Black_from_a_camera.jpg");
        BackgroundImage imagenFondo = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenFondo));

        Label infoActual = new Label("Info de la capital");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(infoActual);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.TOP_RIGHT);
    }

}
