package edu.fiuba.algo3.vista.controles.polilla;

import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.vista.opciones.OpcionMostrarInfoSospechoso;
import javafx.scene.control.MenuItem;

public class MenuItemSospechoso extends MenuItem {
    public MenuItemSospechoso(Sospechoso sus){
        this.setText(sus.nombreDelSospechoso());
        OpcionMostrarInfoSospechoso itemSospechosoEventHandler = new OpcionMostrarInfoSospechoso(sus);
        this.setOnAction(itemSospechosoEventHandler);






    }


}
