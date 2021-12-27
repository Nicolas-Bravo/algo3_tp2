package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Destino;
import edu.fiuba.algo3.modelo.Edificio;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class VentanaEdificios extends VBox {


    public VentanaEdificios(Destino destinoActual){
       ArrayList<Edificio> edificios = destinoActual.obtenerEdificios();
       for(Edificio edificio : edificios){
           this.getChildren().add(new BotonAgregarEdificio(edificio));
       }

    }

}
