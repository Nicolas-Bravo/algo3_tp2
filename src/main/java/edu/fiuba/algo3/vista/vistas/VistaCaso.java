package edu.fiuba.algo3.vista.vistas;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.*;
import edu.fiuba.algo3.vista.botones.Botonera;
import edu.fiuba.algo3.vista.contenedores.ContenedorHorario;
import edu.fiuba.algo3.vista.contenedores.ContenedorInformacion;
import edu.fiuba.algo3.vista.contenedores.ContenedorIzquierda;
import edu.fiuba.algo3.vista.parents.StackPaneFondoNegro;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaCaso implements MisVistas {
    private Juego juego;
    //private Canvas canvas;
    private HBox hboxPrincipal;
    public VistaCaso(Stage stage, Juego juego) {
        //33:31
        this.juego = juego;
        ContenedorHorario contenedorHorario = new ContenedorHorario(juego);


        ContenedorIzquierda contenedorImagen = ContenedorIzquierda.deTipoImagen(juego, stage);

        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorImagen);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);

        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_CENTER);
        VBox vboxLateralDerecha = new VBox(contenedorInfo, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);
    }

    public Node componentePrincipal() {
        return new StackPaneFondoNegro(this.hboxPrincipal);
    }
}
