package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.Pista;

import java.util.ArrayList;
import java.util.Random;

public class Comun implements Valor {
    @Override
    public int obtenerLargoRuta() {
        return 4;
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
