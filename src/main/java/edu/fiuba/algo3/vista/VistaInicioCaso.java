package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.scene.Node;
import javafx.stage.Stage;

public class VistaInicioCaso implements MisVistas {

    private final Juego juego;
    private final Stage stage;

    public VistaInicioCaso(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;


        ContenedorAsignacionCaso contenedorIzquierda = new ContenedorAsignacionCaso(stage, juego);




        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);

    }

    @Override
    public Node componentePrincipal() {
        return null;
    }
}
