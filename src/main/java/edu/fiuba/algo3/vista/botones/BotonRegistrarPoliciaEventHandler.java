package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.vistas.VistaInicioCaso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class BotonRegistrarPoliciaEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private TextArea textArea;
    private Stage stage;

    public BotonRegistrarPoliciaEventHandler(TextArea ta, Juego juego, Stage stage) {
        textArea = ta;
        this.juego = juego;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent event) {
        juego.crearPolicia(textArea.getText());
        textArea.setText("Policia " + textArea.getText() + " registrado");

        this.stage.getScene().setRoot(new ContenedorPrincipal(stage,juego,new VistaCaso(stage,juego)));
    }
}
