package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {
    private final Mapa mapa;
    public BotonViajarEventHandler() {
        this.mapa = mapa;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        VentanaDestinos ventanaDestinos = new VentanaDestinos(destino, juego);

    }
}
