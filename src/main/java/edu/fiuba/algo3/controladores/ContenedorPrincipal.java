package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.vista.BarraDeMenu;
import edu.fiuba.algo3.vista.VistaJuego;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;
    VistaJuego vistaJuego;
    Canvas canvasCentral;
    VBox contenedorCentral;

    public ContenedorPrincipal(Stage stage, Juego juego){
        this.setMenu(stage);
        this.setCentro(juego);
        //this.setConsola();
    }

    private void setCentro(Juego juego) {
        this.vistaJuego = new VistaJuego(juego);
        this.setBottom(vistaJuego.componentePrincipal());
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
