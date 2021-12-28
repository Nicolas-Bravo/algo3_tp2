package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.pista.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivoDestinos {

    private static ArrayList<Pista> generarPistas(String pistas){

        ArrayList<Pista> descripcion = new ArrayList<>();

        String[] campos = pistas.split(";");
        String[] aux;

        for(int i=1; i<3; i++) {
            aux = campos[i].split(",");
            for(String p:aux){
                if(!p.equals("-")) {
                    descripcion.add(new PistaPuerto(p));
                }
            }
        }

        for(int i=3; i<5; i++) {
            aux = campos[i].split(",");
            for(String p:aux){
                if(!p.equals("-")) {
                    descripcion.add(new PistaEconomica(p));
                }
            }
        }

        for(int i=5; i<campos.length; i++) {
            aux = campos[i].split(",");
            for(String p:aux){
                if(!p.equals("-")) {
                    descripcion.add(new PistaBiblioteca(p));
                }
            }
        }

        return descripcion;
    }


    private static ArrayList<ArrayList> generarDescripcion(String pistas){

        ArrayList<ArrayList> matriz = new ArrayList<>();

        String[] campos = pistas.split("|");


        ArrayList<Pista> nombre = new ArrayList<>();

        nombre.add(new Pista(campos[0]));
        matriz.add(nombre);

        ArrayList<Pista> descripcionFacil = generarPistas(campos[1]);
        ArrayList<Pista> descripcionMedia = generarPistas(campos[2]);
        ArrayList<Pista> descripcionDificil = generarPistas(campos[3]);

        matriz.add(descripcionFacil);
        matriz.add(descripcionMedia);
        matriz.add(descripcionDificil);

        return matriz;

    }

    public static ArrayList<DestinoCandidato> generarListaDestinosCandidatos() {
        ArrayList<DestinoCandidato> listaDestinos= new ArrayList<>();
        try {
            File myObj = new File("Archivos/destinos.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listaDestinos.add(new DestinoCandidato(generarDescripcion(data)));
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error with files occurred.");
            e.printStackTrace();
        }
        return listaDestinos;
    }
}
