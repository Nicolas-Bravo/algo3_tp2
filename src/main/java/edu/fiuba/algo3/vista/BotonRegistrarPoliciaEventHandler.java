package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

public class BotonRegistrarPoliciaEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private TextArea textArea;

    public BotonRegistrarPoliciaEventHandler(TextArea ta, Juego juego) {
        textArea = ta;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent event) {
        juego.crearPolicia(textArea.getText());

    }
}
