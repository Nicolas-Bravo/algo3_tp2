package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Sospechoso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class OpcionMostrarInfoSospechoso implements EventHandler<ActionEvent> {
    private Sospechoso sospechoso;
    public OpcionMostrarInfoSospechoso(Sospechoso sospechoso){
        this.sospechoso = sospechoso;

    }

    @Override
    public void handle(ActionEvent event){
        Alert informacion = new Alert(Alert.AlertType.CONFIRMATION);
        informacion.setTitle("Información de Sospechosos");
        informacion.setHeaderText(sospechoso.nombreDelSospechoso());
        informacion.setContentText("Nombre: " +sospechoso.datosSospechoso().get(0).mostrarPista()+ "\n" +
               "Sexo: " + sospechoso.datosSospechoso().get(1).mostrarPista() + "\n" +
               "Hobbie: " + sospechoso.datosSospechoso().get(2).mostrarPista() + "\n" +
                "Color de pelo: " + sospechoso.datosSospechoso().get(3).mostrarPista() + "\n" +
                "Seña: " + sospechoso.datosSospechoso().get(4).mostrarPista() + "\n" +
                "Rodado: " + sospechoso.datosSospechoso().get(5).mostrarPista());
        informacion.show();
    }
}
