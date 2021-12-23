package edu.fiuba.algo3.vista;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContenedorTipeadora extends StackPane {

    public ContenedorTipeadora() {
        this.setWidth(240);
        this.setHeight(500);

        TextArea textArea = new TextArea("Ingrese su nombre");
        Button botonEnviar = new Button();
        VBox vbox = new VBox();
        vbox.getChildren().addAll(textArea, botonEnviar);
        this.getChildren().add(vbox);
    }

}
