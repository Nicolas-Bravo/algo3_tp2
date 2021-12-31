package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;
import java.util.Collections;

public class Filtro extends HBox {
    private BotonFiltro botonFiltro;
    public Filtro(Pista[] pistas) {
        Label descripcion = new Label(pistas[0].mostrarPista());
        descripcion.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
        descripcion.setTextFill(Color.web("FFFFFF"));
        descripcion.setAlignment(Pos.CENTER_LEFT);
        descripcion.setPadding(new Insets(25));
        ArrayList<Pista> listaPistas = new ArrayList<>();
        Collections.addAll(listaPistas, pistas);
        listaPistas.remove(0);
        botonFiltro = new BotonFiltro(listaPistas);

        this.getChildren().addAll(descripcion, botonFiltro);

    }

    public Pista obtenerPista() {
        return botonFiltro.obtenerPista();
    }
}
