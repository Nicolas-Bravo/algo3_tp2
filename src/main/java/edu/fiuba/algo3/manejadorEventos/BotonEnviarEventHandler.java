package edu.fiuba.algo3.manejadorEventos;


import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.BreakIterator;

public class BotonEnviarEventHandler implements EventHandler<ActionEvent> {
    private StackPane raiz;
    private Stage stageActual;
    private Juego juego;
    private TextField textField;
    private Label label;


    public BotonEnviarEventHandler(Stage stage, Juego juego, TextField textField) {
        this.stageActual = stage;
        this.juego = juego;
        this.textField = textField;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.textField.getText().trim().equals("")) {
            this.textField.setText("Ingrese un nombre por favor");
            this.textField.requestFocus();

        } else {
            this.juego.crearPolicia(this.textField.getText());
            Image img = new Image("https://tse1.mm.bing.net/th?id=OIP.eEbCv5U2iIMApDbQLPfOiAHaEK&pid=Api&P=0&w=327&h=185");
            BackgroundImage backgimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            Background back = new Background(backgimg);
            TextField ingreseNombrePolicia = new TextField();
            Button enviar = new Button("Enviar");


            raiz.setBackground(back);
            raiz.getChildren().add(ingreseNombrePolicia);

            Scene escenaAMostrar = new Scene(raiz, 500, 500);

            this.stageActual.setScene(escenaAMostrar);
            this.stageActual.show();
        }
    }
}

