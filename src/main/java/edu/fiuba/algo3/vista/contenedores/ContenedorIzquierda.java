package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.botones.BotonRegistrarPolicia;
import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorIzquierda extends StackPane {

    private Juego juego;
    private Stage stage;

    public ContenedorIzquierda(Juego juego, Stage stage) {
        this.juego = juego;
        this.stage = stage;

        TextArea textArea = new TextArea();
        textArea.setPromptText("Ingrese su nombre");
        BotonRegistrarPolicia botonEnviar = new BotonRegistrarPolicia(textArea, juego, stage);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(textArea, botonEnviar);
        this.getChildren().add(vbox);
        this.setAlignment(Pos.CENTER_LEFT);
    }

    public static ContenedorIzquierda deTipoImagen(Juego juego, Stage stage){
        ContenedorIzquierda contenedorIzquierda = new ContenedorIzquierda(juego, stage);
        contenedorIzquierda.mostrarImagen();
        return contenedorIzquierda;
    }

    public void mostrarImagen(){

        Image image = new Image(juego.imagenCapitalActual());
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(550);
        imgView.setFitWidth(460);

        this.setAlignment(Pos.BOTTOM_LEFT);
        this.getChildren().remove(0);
        this.getChildren().add(imgView);
    }

    public static ContenedorIzquierda deTipoImagen(Juego juego, Stage stage, String imagenMostrar){
        ContenedorIzquierda contenedorIzquierda = new ContenedorIzquierda(juego, stage);
        contenedorIzquierda.mostrarImagen(imagenMostrar);
        return contenedorIzquierda;
    }

    private void mostrarImagen(String imagenMostrar) {

        Image image = new Image(imagenMostrar);
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(900);
        imgView.setFitWidth(460);

        this.setAlignment(Pos.BOTTOM_LEFT);
        this.getChildren().remove(0);
        this.getChildren().add(imgView);
    }


}
