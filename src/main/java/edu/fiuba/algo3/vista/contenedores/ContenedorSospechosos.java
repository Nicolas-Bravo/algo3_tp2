package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.vista.parents.VBoxContenedorSospechosos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ContenedorSospechosos extends StackPane {
    public ContenedorSospechosos(Juego juego, Stage stage, ArrayList<Sospechoso> sospechosos) {
        Image image = new Image("https://img.freepik.com/free-vector/seamless-gold-rhombus-grid-pattern-black-background_53876-97589.jpg?size=626&ext=jpg&ga=GA1.2.2079889573.1629072000");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(550);
        imgView.setFitWidth(550);

        VBoxContenedorSospechosos vbox = new VBoxContenedorSospechosos(sospechosos);

        this.getChildren().addAll(imgView, vbox);
    }
}
