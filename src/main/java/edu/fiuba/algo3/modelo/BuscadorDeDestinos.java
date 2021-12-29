package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.DestinoCandidato;
import edu.fiuba.algo3.modelo.archivos.LectorArchivoDestinos;
import edu.fiuba.algo3.modelo.pista.Pista;
import edu.fiuba.algo3.modelo.valor.Valor;

import java.util.ArrayList;

public class BuscadorDeDestinos {

    private static ArrayList<DestinoCandidato> listaDestinos = LectorArchivoDestinos.generarListaDestinosCandidatos();
    
    private static Destino generarSiguiente(DestinoCandidato actual, DestinoCandidato siguiente, Valor valor){

        return new Destino(actual.obtenerNombre().mostrarPista(), actual.obtenerCoordenadas(), siguiente.obtenerEdificios(valor));
    }

    public static RutaDeEscape obtenerRutaDeEscape(Tesoro tesoro) {

        int tope = tesoro.obtenerLargoRuta();

        Destino[] destinoArray;
        destinoArray = new Destino[tope];

        Destino destino;
        DestinoCandidato actual = obtenerCandidatoPorNombre(tesoro.obtenerInicio());
        DestinoCandidato sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));

        for(int i = 0; i < tope; i++){
            destino = generarSiguiente(actual, sig, tesoro.obtenerValor());
            destinoArray[i] = destino;
            actual = sig;
            sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));
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
        //saco los repetidos

        int tope = destinos.size()+2;

        Destino[] destinoErroneoArray;
        destinoErroneoArray = new Destino[tope];

        Destino destinoErroneo;
        DestinoCandidato sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));

        for(int i = 0; i < tope; i++){
            destinoErroneo = sig.generarDestinoErroneo();
            destinoErroneoArray[i] = destinoErroneo;
            sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));
        }

        int i = 0;
        for (Destino d : destinos){
            d.agregarDestinoPosible(destinoErroneoArray[i]);
            destinoErroneoArray[i].agregarDestinoPosible(d);
            destinoErroneoArray[i].agregarDestinoPosible(destinoErroneoArray[i+1]);
            destinoErroneoArray[i].agregarDestinoPosible(destinoErroneoArray[i+2]);
            i++;
        }

        for(Destino d : destinoErroneoArray){
            destinos.add(d);
        }

        return destinos;


    }
}
