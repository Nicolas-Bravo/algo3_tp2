package edu.fiuba.algo3.vista;

import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

public class BarraDeMenu extends MenuBar {
    MenuItem opcionPantallaCompleta;

    public BarraDeMenu(Stage stage) {
        opcionPantallaCompleta = new MenuItem("Pantalla completa");
        Menu menuArchivo = new Menu("Archivo");
        Menu menuVer = new Menu("Ver");
        Menu menuAyuda = new Menu("Ayuda");
        MenuItem opcionSalir = new MenuItem("Salir");
        MenuItem opcionAbrir = new MenuItem("Abrir");

        menuArchivo.getItems().addAll(opcionAbrir, new SeparatorMenuItem(), opcionSalir);
        //menuAyuda.getItems().addAll(opcionAcercaDe);
        menuVer.getItems().addAll(opcionPantallaCompleta);
        this.getMenus().addAll(menuArchivo, menuVer, menuAyuda);

    }


}
