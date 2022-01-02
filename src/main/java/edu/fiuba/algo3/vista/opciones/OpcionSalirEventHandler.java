package edu.fiuba.algo3.vista.opciones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OpcionSalirEventHandler implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent accion){
        System.exit(0);
    }


}
