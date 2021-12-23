package edu.fiuba.algo3.vista;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ContenedorInformacion extends StackPane {

    public ContenedorInformacion() {
        this.setWidth(240);
        this.setHeight(500);

        TextArea textArea = new TextArea("mucha info");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(textArea);
        this.getChildren().add(vbox);
    }

}
