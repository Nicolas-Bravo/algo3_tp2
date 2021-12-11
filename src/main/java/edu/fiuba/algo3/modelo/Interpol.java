package edu.fiuba.algo3.modelo;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Interpol {


    public static ArrayList<String> buscarSospechosos(String... datos){
        ArrayList<String> lista_nombres = new ArrayList<>();
        try {
            File myObj = new File("/home/fran/algo3_tp2/Archivos/ladrones.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                boolean contienetodos;
                for(String dato:datos){
                    contienetodos =data.contains(dato);
                    if(contienetodos){
                        lista_nombres.add(data.split(",")[0]);
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return lista_nombres;

    }
}
