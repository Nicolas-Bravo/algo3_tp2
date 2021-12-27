package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.manejadorEventos.BotonJugarEventHandler;
import edu.fiuba.algo3.vista.BotonRegistrarPoliciaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorBienvenidos extends VBox {
    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena) {
        super();
        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(25));
        Image image = new Image("https://www.enter.co/wp-content/uploads/2019/01/Carmen-Sandiego-Still-001.jpg");
        BackgroundImage imagenFondo = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenFondo));

        Button botonJugar = new Button();
        botonJugar.setText("Jugar");
        Label etiqueta = new Label();
        etiqueta.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,18));
        etiqueta.setText("Bienvenidos a Carmen Sandiego");
        etiqueta.setTextFill(Color.web("00FFFF"));

        BotonJugarEventHandler botonJugarHandler = new BotonJugarEventHandler(stage, proximaEscena);
        botonJugar.setOnAction(botonJugarHandler);


        this.getChildren().addAll(etiqueta,botonJugar);


    }
}
