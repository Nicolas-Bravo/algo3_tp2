package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Filtro extends HBox {
    private BotonFiltro botonFiltro;
    public Filtro(Pista[] pistas) {
        Label descripcion = new Label(pistas[0].mostrarPista());
        botonFiltro = new BotonFiltro(pistas);
        descripcion.setAlignment(Pos.CENTER_LEFT);
        this.getChildren().addAll(descripcion, botonFiltro);

    }

    public Pista obtenerPista() {
        return botonFiltro.obtenerPista();
    }
}
