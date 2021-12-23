package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaJuego {
    private Juego juego;
    //private Canvas canvas;
    private HBox hboxPrincipal;
    public VistaJuego(Juego juego) {
        //33:31
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario();
        ContenedorTipeadora contenedorTipeadora = new ContenedorTipeadora();
        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorTipeadora);
        vboxLateralIzquierda.setAlignment(Pos.BASELINE_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion();
        Botonera botonera = new Botonera();
        VBox vboxLateralDerecha = new VBox(contenedorInfo, botonera);
        vboxLateralDerecha.setAlignment(Pos.BASELINE_RIGHT);
        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    public Node componentePrincipal() {
        return this.hboxPrincipal;
    }
}
