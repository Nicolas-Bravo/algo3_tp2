package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mapa {

    private ArrayList<Destino> destinos;
    private Destino destinoActual;


    public Mapa(String archivo) {

        this.destinos = new ArrayList<Destino>();

        try{
            File file = new File(archivo);
            Scanner scanner = new Scanner(file);
            String linea = scanner.nextLine();
            String[] campos = linea.split(";");
            while(scanner.hasNextLine()){
                linea = scanner.nextLine();
                campos = linea.split(";");
                this.destinos.add(new Destino(campos[0]));
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("Finish");
        }

        this.destinoActual = destinos.get(0);
    }

    public int entrarBanco() {
        return this.destinoActual.entrarBanco();
    }

    public boolean bancoMostroPista() {
        return this.destinoActual.bancoMostroPista();
    }

    public int entrarAeropuerto() {
        return this.destinoActual.entrarAeropuerto();
    }

    public boolean aeropuertoMostroPista() {
        return this.destinoActual.aeropuertoMostroPista();
    }

    public int entrarBiblioteca() {
        return this.destinoActual.entrarBiblioteca();
    }

    public boolean bibliotecaMostroPista() {
        return this.destinoActual.bibliotecaMostroPista();
    }

    public int entrarPuerto() {
        return this.destinoActual.entrarPuerto();
    }

    public boolean puertoMostroPista() {
        return this.destinoActual.puertoMostroPista();
    }

    public String getNombre() {
        return this.destinoActual.getNombre();
    }

    public int viajarMexico() {
        this.destinoActual = this.destinos.get(1);
        return 5;
    }
}
