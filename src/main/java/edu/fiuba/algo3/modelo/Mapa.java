package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mapa {

    private ArrayList<Destino> destinos;
    private Destino destinoActual;


/*    public Mapa(String archivo) {

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
*/
    public Mapa(ArrayList<Destino> destinos_parametros){
        this.destinos = destinos_parametros;
        this.destinoActual = destinos_parametros.get(0);
    }

    public void viajar(Destino destino) {
        int index = this.destinos.indexOf(destino);
        this.destinoActual = destinos.get(index);
    }

    public Destino destinoActual() {
        return this.destinoActual;
    }
}
