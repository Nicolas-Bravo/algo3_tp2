package edu.fiuba.algo3;

import edu.fiuba.algo3.controladores.ContenedorBienvenidos;
import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(final Stage stage){
        /*
        var javaVersion = SystemInfo.javaVersion();

        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();

         */
        stage.setTitle("Carmen Sandiego");

        Juego juego = crearModelo();
        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, juego);
        Scene escenaJuego = new Scene(contenedorPrincipal,640,480);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage,escenaJuego);
        Scene escenaBienvenida = new Scene(contenedorBienvenidos,640,480);
        stage.setScene(escenaBienvenida);
        stage.show();
    }

    private Juego crearModelo() {

        return new Juego();
    }

    public static void main(String[] args) {
        launch();
    }

}