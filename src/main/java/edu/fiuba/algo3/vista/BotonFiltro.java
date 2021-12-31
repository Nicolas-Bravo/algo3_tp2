package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

import java.util.List;

public class BotonFiltro extends Button {

    private Pista pistaActual;

    public BotonFiltro(Pista[] listaPistas) {
        this.setMaxHeight(70);
        this.setMinHeight(70);
        this.setMaxWidth(150);
        this.setMinWidth(150);

        this.setAlignment(Pos.CENTER_RIGHT);
        this.setOnAction(new BotonFiltroEventHandler(listaPistas, this));
    }


    public Pista obtenerPista() {
        return this.pistaActual;
    }

    public void setPistaActual(Pista pistaActual) {
        this.pistaActual = pistaActual;
        this.setText(pistaActual.mostrarPista());
    }
}
