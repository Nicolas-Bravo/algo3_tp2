package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.DestinoCandidato;
import edu.fiuba.algo3.modelo.archivos.LectorArchivoDestinos;
import edu.fiuba.algo3.modelo.pista.Pista;

import java.util.ArrayList;

public class BuscadorDeDestinos {

    private static ArrayList<DestinoCandidato> listaDestinos = LectorArchivoDestinos.generarListaDestinosCandidatos();
    
    private static Destino generarSiguiente(Tesoro t, DestinoCandidato siguiente){

        return new Destino(t.obtenerInicio().mostrarPista(), 10.00, 10.00, siguiente.obtenerEdificios(t.obtenerValor()));
    }

    public static RutaDeEscape obtenerRutaDeEscape(Tesoro tesoro) {

        int tope = tesoro.obtenerLargoRuta();

        Destino[] destinoArray;
        destinoArray = new Destino[tope];

        Destino actual;
        Pista nombre_actual = tesoro.obtenerInicio();
        DestinoCandidato sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));

        for(int i = 0; i < tope; i++){
            actual = generarSiguiente(tesoro, sig);
            destinoArray[i] = actual;
            nombre_actual = sig.obtenerNombre();
            sig = listaDestinos.get((int) (Math.random() * listaDestinos.size()));
        }

        return new RutaDeEscape(destinoArray);

    }
}
