package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.Juego;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends StackPane {
    BarraDeMenu menuBar;
    VistaJuego vistaJuego;
    Canvas canvasCentral;
    VBox contenedorCentral;
    public ContenedorPrincipal(Stage stage, Juego juego){
        this.setMenu(stage);
        this.setCentro(juego);
        this.setConsola();

    }
}
