package edu.fiuba.algo3.vista.controles.polilla;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.vista.opciones.OpcionIntegrantesEventHandler;
import edu.fiuba.algo3.vista.opciones.OpcionSalirEventHandler;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

import java.util.List;

public class BarraDeMenu extends MenuBar {
    MenuItem opcionPantallaCompleta;


    public BarraDeMenu(Stage stage, Juego juego) {
        opcionPantallaCompleta = new MenuItem("Pantalla completa");
        Menu menuArchivo = new Menu("Archivo");
        Menu menuVer = new Menu("Ver");
        Menu menuAyuda = new Menu("Ayuda");
        Menu menuAcercaDe = new Menu("Acerca de");
        Menu menuSospechoso = obtenerSospechosos(juego);
        MenuItem opcionSalir = new MenuItem("Salir");
        MenuItem opcionAbrir = new MenuItem("Abrir");
        MenuItem opcionIntegrantes = new MenuItem("Desarrolladores");



        OpcionSalirEventHandler opcionSalirHandler = new OpcionSalirEventHandler();
        opcionSalir.setOnAction(opcionSalirHandler);

        OpcionIntegrantesEventHandler opcionIntegrantesHandler = new OpcionIntegrantesEventHandler();
        opcionIntegrantes.setOnAction(opcionIntegrantesHandler);

        menuArchivo.getItems().addAll(opcionAbrir, new SeparatorMenuItem(), opcionSalir);
        menuAcercaDe.getItems().addAll(opcionIntegrantes);
        //menuAyuda.getItems().addAll(opcionAcercaDe);
        menuVer.getItems().addAll(opcionPantallaCompleta);
        this.getMenus().addAll(menuArchivo, menuVer, menuAyuda, menuAcercaDe, menuSospechoso);

    }
    public Menu obtenerSospechosos(Juego juego){
        List<Sospechoso> lista =  juego.obtenerListaSospechosos();
        Menu menuSospechoso = new Menu("Sospechosos");
        for (Sospechoso sospect: lista){
            MenuItemSospechoso menuSusp = new MenuItemSospechoso(sospect);
            menuSospechoso.getItems().add(menuSusp);
        }
        return menuSospechoso;


    }


}
