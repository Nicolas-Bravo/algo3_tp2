package edu.fiuba.algo3.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class StackPaneFondoNegro extends StackPane {
    public StackPaneFondoNegro(HBox hboxPrincipal) {
        super(hboxPrincipal);
        Image img = new Image("https://img.freepik.com/free-vector/seamless-gold-rhombus-grid-pattern-black-background_53876-97589.jpg?size=626&ext=jpg&ga=GA1.2.2079889573.1629072000");
        BackgroundImage backImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backImg);
        this.setBackground(background);
    }
}
