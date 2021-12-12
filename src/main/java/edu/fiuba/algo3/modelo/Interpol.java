package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Interpol{

    public static ArrayList<String> buscarSospechosos(String... datos)throws DescripcionIngresadaErroneaError {
        ArrayList<String> lista_nombres = new ArrayList<>();
        try {
            File myObj = new File("/home/fran/algo3_tp2/Archivos/ladrones.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Sospechoso sospechoso = new Sospechoso(data);
                sospechoso.contiene(datos, lista_nombres);
            /*
                boolean contienetodos;
                for(String dato:datos){
                    contienetodos=data.contains(dato);

                }
                if(contienetodos){
                    lista_nombres.add(data.split(",")[0]);
                }
             */
           }



            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (lista_nombres.isEmpty()){
            throw new DescripcionIngresadaErroneaError();
        }
        else return lista_nombres;

    }
}
