package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorBusquedaSospechosos extends StackPane {
    private final Juego juego;

    public ContenedorBusquedaSospechosos(Stage stage, Juego juego) {
        this.juego = juego;

        VBoxControlesFiltro vboxPrincipal = new VBoxControlesFiltro(stage, juego);


    }
}
