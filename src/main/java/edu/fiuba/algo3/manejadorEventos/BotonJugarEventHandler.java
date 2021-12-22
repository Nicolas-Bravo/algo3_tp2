package edu.fiuba.algo3.manejadorEventos;

import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
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
        stage.setFullScreen(true);

    }



}

