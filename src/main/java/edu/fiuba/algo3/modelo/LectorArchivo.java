package edu.fiuba.algo3.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivo {

    private static Pista[] generarDescripcion(String data){
        ArrayList<Pista> descripcion = new ArrayList<>();

        String[] datos = data.split(";");

        for(String dato:datos){
            descripcion.add(new Pista(dato));
        }

        return descripcion.toArray(new Pista[0]);


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
