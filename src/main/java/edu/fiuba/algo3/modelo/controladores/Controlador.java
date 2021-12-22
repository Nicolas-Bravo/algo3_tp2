package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.manejadorEventos.BotonEnviarEventHandler;
import edu.fiuba.algo3.manejadorEventos.BotonJugarEventHandler;
import edu.fiuba.algo3.modelo.Juego;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Controlador {
    private Stage stage;
    private Juego juego;

    public Controlador(Stage unStage, Juego unJuego){
        this.stage = unStage;
        this.stage.setFullScreen(true);
        this.juego = unJuego;
        primeraVista();
    }


    public void primeraVista(){
        StackPane raiz = new StackPane();
        Image img = new Image("https://www.enter.co/wp-content/uploads/2019/01/Carmen-Sandiego-Still-001.jpg");
        BackgroundImage backgimg = new BackgroundImage(img,  BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background back = new Background(backgimg);

        Button BotonJugar = new Button("Jugar");

        BotonJugarEventHandler HandleBotonJugar = new BotonJugarEventHandler(this.stage,this.juego,raiz);
        BotonJugar.setOnAction(HandleBotonJugar);

        raiz.setBackground(back);
        raiz.getChildren().add(BotonJugar);

        Scene scene = new Scene(raiz, 600, 400);
        this.stage.setScene(scene);
        this.stage.show();

    }

        public void generarImagenDeBievenida(){
            StackPane raiz = (StackPane) this.stage.getScene().getRoot();
            Image img = new Image("https://tse1.mm.bing.net/th?id=OIP.eEbCv5U2iIMApDbQLPfOiAHaEK&pid=Api&P=0&w=327&h=185");
            BackgroundImage backgimg = new BackgroundImage(img,  BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            Background back = new Background(backgimg);
            TextField ingreseNombrePolicia = new TextField();
            Button enviar = new Button("Enviar");
            BotonEnviarEventHandler botonEnviar = new BotonEnviarEventHandler(this.stage,this.juego, ingreseNombrePolicia);
            enviar.setOnAction(botonEnviar);


            raiz.setBackground(back);
            raiz.getChildren().add(ingreseNombrePolicia);
            raiz.getChildren().add(enviar);

            Scene escenaAMostrar = new Scene(raiz);
        }
}