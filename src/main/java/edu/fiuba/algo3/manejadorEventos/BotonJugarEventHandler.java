package edu.fiuba.algo3.manejadorEventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonJugarEventHandler implements EventHandler<ActionEvent> {
    private Scene proximaEscena;
    Stage stage;


    public BotonJugarEventHandler(Stage stage, Scene proximaEscena) {
        this.proximaEscena = proximaEscena;
        this.stage = stage;
    }



    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(proximaEscena);
        stage.setFullScreenExitHint("");
    }



}

