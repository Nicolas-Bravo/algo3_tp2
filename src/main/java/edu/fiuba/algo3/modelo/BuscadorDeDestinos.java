package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.archivos.DestinoCandidato;
import edu.fiuba.algo3.modelo.archivos.LectorArchivoDestinos;

import java.util.ArrayList;

public class BuscadorDeDestinos {

    private static ArrayList<DestinoCandidato> listaDestinos = LectorArchivoDestinos.generarListaDestinosCandidatos();

    public static RutaDeEscape generarRutaDeEscape(Pista inicio){

        Destino[] destinoArray;
        destinoArray = new Destino[4];
        
        Destino actual;
        DestinoCandidato sig = listaDestinos.get((int) Math.random() * listaDestinos.size());
        for(int i = 0; i < 4; i++){
            actual = generarSiguiente(inicio, sig);
            destinoArray[i] = actual;
            inicio = sig.obtenerNombre();
            sig = listaDestinos.get((int) Math.random() * listaDestinos.size());
        }
        
        return new RutaDeEscape(destinoArray);

    }
    
    private static Destino generarSiguiente(Pista actual, DestinoCandidato siguiente){
        
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];

        edificiosArray[0] = siguiente.obtenerEconomico();
        edificiosArray[1] = siguiente.obtenerPuerto();
        edificiosArray[2] = siguiente.obtenerBiblioteca();

        return new Destino(actual.mostrarPista(), 10.00, 10.00, edificiosArray);
    }

}
