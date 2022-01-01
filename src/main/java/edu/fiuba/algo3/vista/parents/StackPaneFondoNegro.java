package edu.fiuba.algo3.vista.parents;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class StackPaneFondoNegro extends StackPane {
    public StackPaneFondoNegro(HBox hboxPrincipal) {
        Image img = new Image("https://cdn.wallpapersafari.com/42/56/WLmU5k.jpg");
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(768);
        imgView.setFitWidth(1024);
        this.getChildren().addAll(imgView, hboxPrincipal);


        //BackgroundImage backImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        //Background background = new Background(backImg);
        //this.setBackground(background);
    }
}
