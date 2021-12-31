package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaBusquedaSospechosos implements MisVistas {

    private final Juego juego;
    private final Stage stage;
    private final HBox hboxPrincipal;

    public VistaBusquedaSospechosos(Stage stage, Juego juego) {
        this.juego = juego;
        this.stage = stage;

        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);


        ContenedorIzquierda contenedorImagen = ContenedorIzquierda.deTipoImagen(juego, stage);



        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorImagen);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);

        ContenedorBusquedaSospechosos contenedorBusqueda = new ContenedorBusquedaSospechosos(stage, juego);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_CENTER);
        VBox vboxLateralDerecha = new VBox(contenedorInfo, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);




    }

    @Override
    public Node componentePrincipal() {
        return null;
    }
}
