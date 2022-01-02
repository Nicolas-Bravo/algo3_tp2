package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.controles.polilla.LabelBlanca;
import edu.fiuba.algo3.vista.botones.BotonIniciarCaso;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorAsignacionCaso extends StackPane {
    public ContenedorAsignacionCaso(Stage stage, Juego juego) {
        LabelBlanca nombre = new LabelBlanca("Hola " + juego.tituloPolicia() + "\n");

        String textoBienvenida = "Se le ha asignado un nuevo caso:\n\n" +
                "Se ha reportado el robo de " + juego.nombreTesoroActual() + "\n" +
                "Un sospechoso de genero " + juego.generoLadron() + " fue visto \nescapando la escena\n" +
                "Tu trabajo es rastrear al culpable y atraparlo!\nTienes tiempo hasta el domingo a las 7\n" +
                "para encontrarlo.\nBuena suerte " + juego.tituloPolicia() + "!";

        LabelBlanca lblBienvenida = new LabelBlanca(textoBienvenida);

        BotonIniciarCaso botonIniciar = new BotonIniciarCaso(stage, juego);

        VBox vbox = new VBox(nombre, lblBienvenida, botonIniciar);
        this.getChildren().addAll(vbox);
    }
}
