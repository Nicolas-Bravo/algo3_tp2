package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.manejadorEventos.BotonJugarEventHandler;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.rango.Novato;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class Juego {

    private Policia policia;
    private Caso casoActual;
    private List<Sospechoso> listaSospechosos;
    private List<Tesoro> listaBotines;
    private List<Destino> listaDestinos;
    private Stage stageActual;

    public Juego(Stage stage){
        generarListasDeDatos();
        this.stageActual = stage;
    }

    private void generarListasDeDatos() {
        //ir a lector de archivo
    }

    public void jugar() {
        generarCaso();
    }

    private void generarCaso() {
        this.casoActual = new Caso("Fast Eddie B.", new RutaDeEscape(), new Tesoro("Buda de oro"));

        //this.casoActual = new Caso(policia);
    }

    public void generarBienvenida() {
        StackPane raiz = new StackPane();
        Image img = new Image("https://tse1.mm.bing.net/th?id=OIP.eEbCv5U2iIMApDbQLPfOiAHaEK&pid=Api&P=0&w=327&h=185");
        BackgroundImage backgimg = new BackgroundImage(img,  BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background back = new Background(backgimg);
        TextField ingreseNombrePolicia = new TextField();
        Button enviar = new Button("Enviar");


        raiz.setBackground(back);
        raiz.getChildren().add(ingreseNombrePolicia);
        raiz.getChildren().add(enviar);

        Scene escenaAMostrar = new Scene(raiz);
    }


    private void buscarPolicia() {

    }


    private Scene inicializarControlesVisuales(){
        StackPane pane = new StackPane();
        BackgroundFill color = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
        pane.setStyle("-fx-background-color: BLACK");

        Button botonPrueba = new Button("Anda");
        pane.getChildren().add(botonPrueba);
        return new Scene(pane,400,400);
    }

    public Scene generarImagenDeInicio(){
        VBox raiz = new VBox();
        Image img = new Image("https://www.enter.co/wp-content/uploads/2019/01/Carmen-Sandiego-Still-001.jpg");
        BackgroundImage backgimg = new BackgroundImage(img,  BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background back = new Background(backgimg);

        Button BotonJugar = new Button("Jugar");



        raiz.setBackground(back);
        raiz.getChildren().add(BotonJugar);

        Scene scene = new Scene(raiz, 600, 400);
        BotonJugarEventHandler HandleBotonJugar = new BotonJugarEventHandler(this.stageActual,scene);
        BotonJugar.setOnAction(HandleBotonJugar);
        return scene;

    }


    public void crearPolicia(String text) {
        this.policia = new Policia(text, new Novato());
        this.jugar();
    }

    public String nombreDestinoActual() {
        return policia.destinoActual().toString();
    }

    public String obtenerFechaActual() {
        return policia.fechaActual();
    }

    public String imagenCapitalActual() {
        return policia.enlaceCapitalActual();
    }
}

