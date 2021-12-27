package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Edificio;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class BotonAgregarEdificio extends Button {
    public BotonAgregarEdificio(Edificio edificio) {
        Image image = edificio.obtenerImagen();
        BackgroundImage back = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(back);
        this.setBackground(background);
        this.setText("      ");



    }
}
