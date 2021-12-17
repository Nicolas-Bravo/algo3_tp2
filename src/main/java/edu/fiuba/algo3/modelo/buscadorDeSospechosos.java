package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.DescripcionIngresadaErroneaError;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class BuscadorDeSospechosos {
    ArrayList<Sospechoso> listaSospechosos;
    public BuscadorDeSospechosos() {
        listaSospechosos = new ArrayList<>();
        try {
            File myObj = new File("Archivos/ladrones.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listaSospechosos.add(new Sospechoso(data));
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error with files occurred.");
            e.printStackTrace();
        }
    }



    public ArrayList<Sospechoso> buscarSospechosos(String... pistas)throws DescripcionIngresadaErroneaError {
        ArrayList<Sospechoso> sospechososPosibles = new ArrayList<>();

        for (Sospechoso sospe: this.listaSospechosos) {
            if (sospe.coincideCon(pistas)) {
                sospechososPosibles.add(sospe);
            }
        }
        if (sospechososPosibles.isEmpty()){
            throw new DescripcionIngresadaErroneaError();
        }
        return sospechososPosibles;
    }
}
