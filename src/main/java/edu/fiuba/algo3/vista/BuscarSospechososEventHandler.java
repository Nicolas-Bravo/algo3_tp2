package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controladores.ContenedorPrincipal;
import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.vista.vistas.VistaBusquedaSospechosos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BuscarSospechososEventHandler implements EventHandler<ActionEvent> {
    public Stage stage;
    public Juego juego;

    public BuscarSospechososEventHandler(Stage stage, Juego juego){
        this.juego = juego;
        this.stage = stage;
    }



    @Override
    public void handle(ActionEvent event){
        this.stage.getScene().setRoot(new ContenedorPrincipal(stage, juego, new VistaBusquedaSospechosos(stage, juego)));
    }




}
