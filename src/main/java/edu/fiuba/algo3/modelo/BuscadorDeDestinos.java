package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.DestinoCandidato;
import edu.fiuba.algo3.modelo.archivos.LectorArchivoDestinos;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.valor.Valor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BuscadorDeDestinos {

    private static final ArrayList<DestinoCandidato> listaDestinos = LectorArchivoDestinos.generarListaDestinosCandidatos();

    private static Destino generarSiguiente(DestinoCandidato actual, DestinoCandidato siguiente, Valor valor){

        return new Destino(actual.obtenerNombre().mostrarPista(), actual.obtenerCoordenadas(), actual.obtenerImagen(), siguiente.obtenerEdificios(valor));
    }

    public static RutaDeEscape obtenerRutaDeEscape(Tesoro tesoro) {

        int tope = tesoro.obtenerLargoRuta();

        Destino[] destinoArray;
        destinoArray = new Destino[tope];

        Destino destino;
        DestinoCandidato actual = obtenerCandidatoPorNombre(tesoro.obtenerInicio());

        Random random_method = new Random();
        int index = random_method.nextInt(listaDestinos.size());
        ArrayList<Integer> usados = new ArrayList<>();

        DestinoCandidato sig = listaDestinos.get(index);

        for(int i = 0; i < tope; i++){
            destino = generarSiguiente(actual, sig, tesoro.obtenerValor());
            destinoArray[i] = destino;
            actual = sig;
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(listaDestinos.size());
            }
            sig = listaDestinos.get(index);
        }

        return new RutaDeEscape(destinoArray);

    }

    private static DestinoCandidato obtenerCandidatoPorNombre(Pista nombre) {
        int index = -1;
        for(int i = 0; i < listaDestinos.size(); i++){
            if(listaDestinos.get(i).obtenerNombre().equals(nombre)){
                index = i;
            }
        }

        return listaDestinos.get(index);
    }

    public static ArrayList<Destino> completarMapa(ArrayList<Destino> destinos) {

        ArrayList<Integer> usados = obtenerIndices(destinos);

        int tope = destinos.size()+2;

        Destino[] destinoErroneoArray;
        destinoErroneoArray = new Destino[tope];

        Random random_method = new Random();
        int index = random_method.nextInt(listaDestinos.size());

        while (usados.contains(index)){
            index = random_method.nextInt(listaDestinos.size());
        }

        Destino destinoErroneo;
        DestinoCandidato sig = listaDestinos.get(index);

        for(int i = 0; i < tope; i++){
            destinoErroneo = sig.generarDestinoErroneo();
            destinoErroneoArray[i] = destinoErroneo;
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(listaDestinos.size());
            }
            sig = listaDestinos.get(index);
        }

        int i = 0;
        for (Destino d : destinos){
            d.agregarDestinoPosible(destinoErroneoArray[i]);
            destinoErroneoArray[i].agregarDestinoPosible(d);
            destinoErroneoArray[i].agregarDestinoPosible(destinoErroneoArray[i+1]);
            destinoErroneoArray[i].agregarDestinoPosible(destinoErroneoArray[i+2]);
            i++;
        }

        Collections.addAll(destinos, destinoErroneoArray);

        return destinos;


    }

    private static ArrayList<Integer> obtenerIndices(ArrayList<Destino> destinos) {

        ArrayList<Integer> usados = new ArrayList<>();

        for (Destino destino : destinos){
            for(int i = 0; i < listaDestinos.size(); i++){
                if(listaDestinos.get(i).obtenerNombre().equals(destino.obtenerNombre())){
                    usados.add(i);
                }
            }
        }

        return usados;
    }
}
