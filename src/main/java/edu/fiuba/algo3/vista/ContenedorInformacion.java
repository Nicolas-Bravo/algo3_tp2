package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Pista;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ContenedorInformacion extends StackPane {

    public ContenedorInformacion(Juego juego) {
        this.setWidth(500);
        this.setHeight(900);

        Image image = new Image("https://cdn.discordapp.com/attachments/912029542556790795/925532737782288394/contenedorInfoBack.png");
        ImageView imgView = new ImageView(image);
        VBox vboxx = new VBox(imgView);





        this.getChildren().add(vboxx);
        this.setAlignment(Pos.CENTER);
    }
    public void mostrarPista(Pista pista){
        Label etiqueta = new Label();
        etiqueta.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,18));
        etiqueta.setTextFill(Color.web("FFFFFF"));
        etiqueta.setText(pista.mostrarPista());
        this.getChildren().add(etiqueta);



    }

}
