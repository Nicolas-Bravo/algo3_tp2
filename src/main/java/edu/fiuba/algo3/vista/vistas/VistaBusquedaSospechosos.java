package edu.fiuba.algo3.vista.vistas;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.botones.Botonera;
import edu.fiuba.algo3.vista.contenedores.ContenedorBusquedaSospechosos;
import edu.fiuba.algo3.vista.contenedores.ContenedorHorario;
import edu.fiuba.algo3.vista.contenedores.ContenedorIzquierda;
import edu.fiuba.algo3.vista.parents.StackPaneFondoNegro;
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


        ContenedorBusquedaSospechosos contenedorBusqueda = new ContenedorBusquedaSospechosos(stage, juego);

        Botonera botonera = new Botonera(stage,juego);
        HBox hboxAux = new HBox(botonera);
        hboxAux.setAlignment(Pos.BOTTOM_CENTER);
        VBox vboxLateralDerecha = new VBox(contenedorBusqueda, hboxAux);
        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);




    }

    @Override
    public Node componentePrincipal() {
        return new StackPaneFondoNegro(hboxPrincipal);
    }
}
