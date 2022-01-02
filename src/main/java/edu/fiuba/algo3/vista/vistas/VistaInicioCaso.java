package edu.fiuba.algo3.vista.vistas;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.contenedores.ContenedorAsignacionCaso;
import edu.fiuba.algo3.vista.contenedores.ContenedorHorario;
import edu.fiuba.algo3.vista.contenedores.ContenedorInformacion;
import edu.fiuba.algo3.vista.parents.StackPaneFondoNegro;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaInicioCaso implements MisVistas {

    private final Juego juego;
    private final Stage stage;
    private final HBox hboxPrincipal;

    public VistaInicioCaso(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;

        ContenedorHorario contenedorHorario = new ContenedorHorario();

        ContenedorAsignacionCaso contenedorIzquierda = new ContenedorAsignacionCaso(stage, juego);


        VBox vboxLateralIzquierda = new VBox(contenedorHorario, contenedorIzquierda);
        vboxLateralIzquierda.setAlignment(Pos.TOP_LEFT);



        ContenedorInformacion contenedorInfo = new ContenedorInformacion(juego, stage);

        VBox vboxLateralDerecha = new VBox(contenedorInfo);

        vboxLateralDerecha.setAlignment(Pos.TOP_RIGHT);

        this.hboxPrincipal = new HBox(vboxLateralIzquierda, vboxLateralDerecha);

    }

    @Override
    public Node componentePrincipal() {
        return new StackPaneFondoNegro(hboxPrincipal);
    }
}
