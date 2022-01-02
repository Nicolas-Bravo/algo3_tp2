package edu.fiuba.algo3.vista.controles.polilla;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LabelBlanca extends Label {
    public LabelBlanca() {
        this.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,14));
        this.setTextFill(Color.web("FFFFFF"));
    }

    public LabelBlanca(String texto) {
        this.setText(texto);
        this.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,14));
        this.setTextFill(Color.web("FFFFFF"));
    }
}
