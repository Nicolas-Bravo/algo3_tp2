package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.pistas.PistaGeneral;
import edu.fiuba.algo3.modelo.Sospechoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivoSospechosos {

    private static PistaGeneral[] generarDescripcion(String data){
        ArrayList<PistaGeneral> descripcion = new ArrayList<>();

        String[] datos = data.split(";");

        for(String dato:datos){
            descripcion.add(new PistaGeneral(dato));
        }

        return descripcion.toArray(new PistaGeneral[0]);


    }

    public static ArrayList<Sospechoso> generarListaSospechososTotales() {
        ArrayList<Sospechoso> listaSospechosos = new ArrayList<>();
        try {
            File myObj = new File("Archivos/ladrones.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listaSospechosos.add(new Sospechoso(generarDescripcion(data)));
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error with files occurred.");
            e.printStackTrace();
        }
        return listaSospechosos;
    }



}
