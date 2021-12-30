package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Edificio;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BotonAgregarEdificio extends Button {
    public BotonAgregarEdificio(Edificio edificio, Stage stage, Juego juego) {
        Image image = edificio.obtenerImagen();
        ImageView imgView = new ImageView(image);
        this.setGraphic(imgView);
        this.setOnAction(new BotonEntrarEdificioEventHandler(edificio, stage, juego));
        this.setAlignment(Pos.CENTER);
    }

}
