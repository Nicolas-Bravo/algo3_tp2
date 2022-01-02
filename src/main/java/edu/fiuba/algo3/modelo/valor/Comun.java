package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;
import java.util.Random;

public class Comun implements Valor {
    @Override
    public int obtenerLargoRuta() {
        return 5;
    }

    @Override
    public Edificio[] obtenerEdificiosConSospechoso(ArrayList<ArrayList> descripcion, Pista pista) {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];
        ArrayList<Pista> facil = descripcion.get(1);

        edificiosArray[0] = pista.obtenerEdificio();

        Random random_method = new Random();
        int index = random_method.nextInt(facil.size());
        ArrayList<Integer> usados = new ArrayList<>();

        for(int i = 1; i < 3; i++){
            edificiosArray[i] = facil.get(index).obtenerEdificio();
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(facil.size());
            }

        }
        return edificiosArray;
    }


    @Override
    public Edificio[] obtenerEdificios(ArrayList<ArrayList> descripcion) {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];
        ArrayList<Pista> facil = descripcion.get(1);


        Random random_method = new Random();
        int index = random_method.nextInt(facil.size());
        ArrayList<Integer> usados = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            edificiosArray[i] = facil.get(index).obtenerEdificio();
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(facil.size());
            }

        }
        return edificiosArray;
    }

}
