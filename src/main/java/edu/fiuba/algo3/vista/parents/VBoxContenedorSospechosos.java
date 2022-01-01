package edu.fiuba.algo3.vista.parents;

import edu.fiuba.algo3.modelo.Sospechoso;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;

public class VBoxContenedorSospechosos extends VBox {
    public VBoxContenedorSospechosos(ArrayList<Sospechoso> sospechosos) {
        this.setAlignment(Pos.TOP_CENTER);
        Label labelInicio = new Label("Sospechosos encontrados: \n");
        labelInicio.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,14));
        labelInicio.setTextFill(Color.web("FFFFFF"));
        labelInicio.setAlignment(Pos.CENTER_LEFT);
        labelInicio.setPadding(new Insets(25));


        this.getChildren().add(labelInicio);
        for (Sospechoso sospechoso: sospechosos) {
            Label labelActual = new Label(sospechoso.nombreDelSospechoso());
            labelActual.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
            labelActual.setTextFill(Color.web("FFFFFF"));
            labelActual.setAlignment(Pos.CENTER_LEFT);
            labelActual.setPadding(new Insets(25));
            this.getChildren().add(labelActual);
        }
        if (sospechosos.size() == 0){
            Label labelNoEncontrado = new Label("No se han encontrado sospechosos que coincidan\nIntente otro filtro");
            labelNoEncontrado.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
            labelNoEncontrado.setTextFill(Color.web("FFFFFF"));
            labelNoEncontrado.setAlignment(Pos.CENTER_LEFT);
            labelNoEncontrado.setPadding(new Insets(25));
            this.getChildren().add(labelNoEncontrado);
        }
        else if (sospechosos.size() == 1) {
            Label emitirOrden = new Label("Se ha emitido una orden de arresto para el sospechoso");
            emitirOrden.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
            emitirOrden.setTextFill(Color.web("FFFFFF"));
            emitirOrden.setAlignment(Pos.CENTER_LEFT);
            emitirOrden.setPadding(new Insets(25));
            this.getChildren().add(emitirOrden);
        }
    }
}
