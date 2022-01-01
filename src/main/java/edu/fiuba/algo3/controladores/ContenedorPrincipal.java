package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.vista.BarraDeMenu;
import edu.fiuba.algo3.vista.MisVistas;
import edu.fiuba.algo3.vista.VistaCaso;
import edu.fiuba.algo3.vista.VistaJuego;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;
    MisVistas vistaActual;
    Canvas canvasCentral;
    VBox contenedorCentral;
    Juego juego;

    public ContenedorPrincipal(Stage stage, Juego juego, MisVistas vistaActual){
        this.juego = juego;
        this.setMenu(stage);
        this.vistaActual = vistaActual;
        this.setCentro();
        Image img = new Image("https://img.freepik.com/free-vector/seamless-gold-rhombus-grid-pattern-black-background_53876-97589.jpg?size=626&ext=jpg&ga=GA1.2.2079889573.1629072000");
        BackgroundImage backImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backImg);
        this.setBackground(background);
    }

    public ContenedorPrincipal(Stage stage, Juego juego) {
        this.juego = juego;
        this.setMenu(stage);
        this.vistaActual = new VistaJuego(juego, stage);
        this.setCentro();
    }

    private void setCentro() {
        this.setCenter(vistaActual.componentePrincipal());
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage, juego);
        this.setTop(menuBar);
    }
}
