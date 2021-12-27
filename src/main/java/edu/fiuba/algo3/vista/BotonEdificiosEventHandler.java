package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonEdificiosEventHandler implements EventHandler<ActionEvent> {
    private final Mapa mapa;

    public BotonEdificiosEventHandler(Mapa mapa) {
        this.mapa = mapa;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
