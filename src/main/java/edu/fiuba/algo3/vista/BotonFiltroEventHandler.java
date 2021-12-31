package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class BotonFiltroEventHandler implements EventHandler<ActionEvent> {
    private final ArrayList<Pista> listaPistas;
    private final BotonFiltro botonPadre;
    int indexActual;
    private Pista pistaActual;

    public BotonFiltroEventHandler(ArrayList<Pista> listaPistas, BotonFiltro botonFiltro) {
        this.botonPadre = botonFiltro;
        indexActual = 0;
        this.listaPistas = listaPistas;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        indexActual++;
        if (indexActual == listaPistas.size()-1) {
            indexActual = 0;
        }
        this.pistaActual = listaPistas.get(indexActual);
        this.botonPadre.setPistaActual(pistaActual);
    }
}