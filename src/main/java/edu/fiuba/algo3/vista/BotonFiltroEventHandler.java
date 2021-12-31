package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.List;

public class BotonFiltroEventHandler implements EventHandler<ActionEvent> {
    private final Pista[] listaPistas;
    private final BotonFiltro botonPadre;
    int indexActual;
    private Pista pistaActual;

    public BotonFiltroEventHandler(Pista[] listaPistas, BotonFiltro botonFiltro) {
        this.botonPadre = botonFiltro;
        indexActual = 0;
        this.listaPistas = listaPistas;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        indexActual++;
        if (indexActual == listaPistas.length-1) {
            indexActual = 0;
        }
        this.pistaActual = listaPistas[indexActual];
        this.botonPadre.setPistaActual(pistaActual);
    }
}
