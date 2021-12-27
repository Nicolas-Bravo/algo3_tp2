package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.vista.BarraDeMenu;
import edu.fiuba.algo3.vista.MisVistas;
import edu.fiuba.algo3.vista.VistaCaso;
import edu.fiuba.algo3.vista.VistaJuego;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;
    MisVistas vistaActual;
    Canvas canvasCentral;
    VBox contenedorCentral;

    public ContenedorPrincipal(Stage stage, Juego juego, MisVistas vistaActual){
        this.setMenu(stage);
        this.vistaActual = vistaActual;
        this.setCentro();
        //this.setConsola();
    }

    public ContenedorPrincipal(Stage stage, Juego juego) {
        this.setMenu(stage);
        this.vistaActual = new VistaJuego(juego, stage);
        this.setCentro();
    }

    private void setCentro() {
        this.setCenter(vistaActual.componentePrincipal());
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
