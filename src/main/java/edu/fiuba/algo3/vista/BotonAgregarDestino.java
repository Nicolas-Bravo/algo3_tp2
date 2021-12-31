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
        this.setText(destino.obtenerNombre());
        this.setOnAction(new BotonViajarACapitalEventHandler(destino, juego, stage));
        this.setAlignment(Pos.CENTER);
        this.setMaxHeight(30);
        this.setMinHeight(30);
    }
}
