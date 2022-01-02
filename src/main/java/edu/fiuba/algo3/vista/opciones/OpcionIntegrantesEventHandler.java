package edu.fiuba.algo3.vista.opciones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class OpcionIntegrantesEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca De");
        alert.setHeaderText("Integrantes");
        String integrantes = "Bravo, Nicolas;" +
                " Cuppari, Franco;" +
                " Monopoli, Francisco;" +
                " Thourte Valentin.";
        alert.setContentText(integrantes);
        alert.show();

    }

}
