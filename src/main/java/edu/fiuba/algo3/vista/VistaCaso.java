package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaCaso implements MisVistas {
    private Juego juego;
    //private Canvas canvas;
    private HBox hboxPrincipal;
    public VistaCaso(Juego juego) {
        //33:31
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);

        ContenedorImagen contenedorTipeadora = new ContenedorImagen(juego);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorTipeadora);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego);

        Botonera botonera = new Botonera();

        VBox vboxLateralDerecha = new VBox(contenedorInfo, botonera);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    public Node componentePrincipal() {
        return this.hboxPrincipal;
    }
}
