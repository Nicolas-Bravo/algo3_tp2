package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ContenedorInformacion extends StackPane {
    Juego juego;
    public ContenedorInformacion(Juego juego) {
        this.setWidth(500);
        this.setHeight(900);
        this.juego = juego;
        Image image = new Image("https://cdn.discordapp.com/attachments/912029542556790795/926320707015704646/contInfo.png");
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(500);
        imgView.setFitWidth(500);
        VBox vboxx = new VBox(imgView);

        this.getChildren().add(vboxx);
        this.setAlignment(Pos.CENTER);
    }

    public void infoFinal() {
        Label labelNombre = new Label("Felicitaciones " + this.juego.tituloPolicia() + ", has arrestado al culpable!");
        labelNombre.setPadding(new Insets(15));
        labelNombre.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
        labelNombre.setTextFill(Color.web("FFFFFF"));

        Label labelVictoria = new Label(juego.textoJugadorGano());
        labelVictoria.setPadding(new Insets(15));
        labelVictoria.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
        labelVictoria.setTextFill(Color.web("FFFFFF"));
        BotonNuevoCaso botonNuevoCaso = new BotonNuevoCaso();
        VBox vbox = new VBox(labelNombre, labelVictoria, botonNuevoCaso);
        vbox.setSpacing(10);

        this.getChildren().addAll(vbox);
    }

    public void mostrarPista(Pista pista){
        Label etiqueta = new Label();
        etiqueta.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,12));
        etiqueta.setMaxWidth(450);
        etiqueta.setAlignment(Pos.TOP_CENTER);
        etiqueta.setTextFill(Color.web("FFFFFF"));
        etiqueta.setText(pista.mostrarPista());

        this.getChildren().add(etiqueta);



    }

}
