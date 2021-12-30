package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.pistas.PistaGeneral;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivoTesoro {

    private static PistaGeneral[] generarDescripcion(String data){
        ArrayList<PistaGeneral> descripcion = new ArrayList<>();

        String[] datos = data.split(";");

        for(String dato:datos){
            descripcion.add(new PistaGeneral(dato));
        }

        return descripcion.toArray(new PistaGeneral[0]);

    }

    public static ArrayList<ArrayList> generarListaTesoroCandidato() {
        ArrayList<ArrayList> matriz = new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosComun= new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosValioso= new ArrayList<>();
        ArrayList<TesoroCandidato> listaTesorosMuyValioso= new ArrayList<>();
        try {
            File myObj = new File("Archivos/tesorosHabilitados.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                PistaGeneral[] array = generarDescripcion(data);
                if(array[0].equals(new PistaGeneral("Comun"))){
                    listaTesorosComun.add(new TesoroCandidato(array));
                } else if (array[0].equals(new PistaGeneral("Valioso"))){
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
