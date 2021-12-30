package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BotonAgregarDestino extends Button {
    public BotonAgregarDestino(Destino destino, Stage stage, Juego juego) {
        Image image = destino.obtenerImagen();
        ImageView imgView = new ImageView(image);
        this.setGraphic(imgView);
        this.setOnAction(new BotonViajarEventHandler(destino, stage, juego));
        this.setAlignment(Pos.CENTER);


    }
}
