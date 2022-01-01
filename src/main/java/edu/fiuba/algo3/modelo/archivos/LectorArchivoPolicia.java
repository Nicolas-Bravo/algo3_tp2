package edu.fiuba.algo3.modelo.archivos;

import edu.fiuba.algo3.modelo.Policia;
import edu.fiuba.algo3.modelo.rangos.Novato;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivoPolicia {
    public static Policia buscarPoliciaPorNombre(String nombre){
        File archivo = new File("Archivos/registroPolicias.csv");
        Policia policiaDevolver = new Policia(nombre, new Novato());
        try {
            Scanner scanner = new Scanner(archivo);
            boolean encontrado = false;
            while (scanner.hasNextLine() && !encontrado) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(";");
                if (datos[0].equals(nombre)) {
                    policiaDevolver.sumarArrestos(Integer.parseInt(datos[2]));
                }
            }
            if (policiaDevolver.cantidadDeArrestos() == 0) {
                registrarPolicia(nombre, archivo);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + archivo.getAbsolutePath());
        }

        return policiaDevolver;
    }

    private static void registrarPolicia(String nombre, File archivo) {
        try {

            FileWriter writer = new FileWriter(archivo);

            String sb = "Nombre" +
                    ';' +
                    "Arrestos" +
                    '\n' +
                    nombre +
                    ';' +
                    "0" +
                    '\n';

            writer.write(sb);

            System.out.println("Policia registrado!");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void aumentarArresto(Policia policia) {


    }
}
