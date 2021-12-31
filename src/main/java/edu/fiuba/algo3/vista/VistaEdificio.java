package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaEdificio implements MisVistas {
    private final HBox hboxPrincipal;
    private final Juego juego;
    private Stage stage;

    //Cambiar contenedor info por edificio
    public VistaEdificio(Stage stage, Juego juego, Edificio edificio) {
        this.juego = juego;
        this.stage = stage;
        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);
        contenedorInfo.mostrarPista(juego.entrarA(edificio));
        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);

        ContenedorIzquierda contenedorImagen = ContenedorIzquierda.deTipoImagen(juego, stage);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorImagen);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_RIGHT);
        VBox vboxLateralDerecha = new VBox(contenedorInfo, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);


        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }


    public Node componentePrincipal() {
        return new StackPane(this.hboxPrincipal);
    }

    public void checkeoFinDelCaso() {
        if (this.juego.casoTerminado()) {
            this.stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, new VistaArrestado(stage, juego)));
        }
    }

}
