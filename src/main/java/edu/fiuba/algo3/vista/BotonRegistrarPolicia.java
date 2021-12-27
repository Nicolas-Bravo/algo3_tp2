package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class BotonRegistrarPolicia extends Button {
    private TextArea textArea;
    public BotonRegistrarPolicia(TextArea textArea, Juego juego, Stage stage) {
        this.setText("Enviar");
        this.textArea = textArea;
        this.setOnAction(new BotonRegistrarPoliciaEventHandler(textArea, juego, stage));
    }
}
