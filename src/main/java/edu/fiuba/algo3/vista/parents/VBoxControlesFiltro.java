package edu.fiuba.algo3.vista.parents;

import edu.fiuba.algo3.controladores.Juego;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.vista.Filtro;
import edu.fiuba.algo3.vista.botones.BotonEjecutarBusqueda;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class VBoxControlesFiltro extends VBox {

    public VBoxControlesFiltro(Stage stage, Juego juego) {
        ArrayList<Pista[]> matrizPistas = generarListasDePistas();
        ArrayList<Filtro> listaFiltros = new ArrayList<>();
        for (Pista[] pistas: matrizPistas) {
            Filtro filtro = new Filtro(pistas);
            listaFiltros.add(filtro);
            this.getChildren().add(filtro);
        }
        BotonEjecutarBusqueda botonBuscar = new BotonEjecutarBusqueda(stage, juego, listaFiltros);
        this.getChildren().add(botonBuscar);
    }

    private ArrayList<Pista[]> generarListasDePistas() {
        ArrayList<Pista[]> listaListas = new ArrayList<>();
        Pista[] listaSexo = {new PistaGeneral("Sexo"), new PistaGeneral(""), new PistaGeneral("Masculino"), new PistaGeneral("Femenino")};
        Pista[] listaHobbies = {new PistaGeneral("Hobby"), new PistaGeneral(""), new PistaGeneral("Escalar"),new PistaGeneral("Croquet"),new PistaGeneral("Tenis")};
        Pista[] listaPelo = {new PistaGeneral("Pelo"), new PistaGeneral(""), new PistaGeneral("Rojo"), new PistaGeneral("Negro"), new PistaGeneral("Rubio"), new PistaGeneral("Castaño")};
        Pista[] listaSenias = {new PistaGeneral("Seña"), new PistaGeneral(""), new PistaGeneral("Aro"),new PistaGeneral("Tattoo"),new PistaGeneral("Joyeria"),new PistaGeneral("")};
        Pista[] listaCoches = {new PistaGeneral("Coche"),new PistaGeneral(""), new PistaGeneral("Rodado"),new PistaGeneral("Motocicleta"),new PistaGeneral("Convertible"),new PistaGeneral("Limusina")};
        Collections.addAll(listaListas,listaSexo,listaHobbies,listaPelo,listaSenias,listaCoches);
        return listaListas;
    }

}
