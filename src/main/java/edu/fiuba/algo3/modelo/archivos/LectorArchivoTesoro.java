package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Pista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivoTesoro {

    private static Pista[] generarDescripcion(String data){
        ArrayList<Pista> descripcion = new ArrayList<>();

        String[] datos = data.split(";");

        for(String dato:datos){
            descripcion.add(new Pista(dato));
        }

        return descripcion.toArray(new Pista[0]);

    }

    public static ArrayList<ArrayList> generarListaTesoroCandidato() {
        ArrayList<ArrayList> matriz = new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosComun= new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosValioso= new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosMuyValioso= new ArrayList<>();
        try {
            File myObj = new File("Archivos/tesoro.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Pista[] array = generarDescripcion(data);
                if(array[0].equals(new Pista("Comun"))){
                    listaTesorosComun.add(new TesoroCandidato(array));
                } else if (array[0].equals(new Pista("Valioso"))){
                    listaTesorosValioso.add(new TesoroCandidato(array));
                } else {
                    listaTesorosMuyValioso.add(new TesoroCandidato(array));
                }
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error with files occurred.");
            e.printStackTrace();
        }

        matriz.add(listaTesorosComun);
        matriz.add(listaTesorosValioso);
        matriz.add(listaTesorosMuyValioso);

        return matriz;
    }

}
