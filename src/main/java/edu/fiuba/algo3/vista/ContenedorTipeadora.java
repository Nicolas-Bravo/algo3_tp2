package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContenedorTipeadora extends StackPane {

    public ContenedorTipeadora(Juego juego) {
        this.setWidth(240);
        this.setHeight(500);

        TextArea textArea = new TextArea("Ingrese su nombre");
        BotonRegistrarPolicia botonEnviar = new BotonRegistrarPolicia(textArea, juego);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(textArea, botonEnviar);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.CENTER_LEFT);
    }

}
