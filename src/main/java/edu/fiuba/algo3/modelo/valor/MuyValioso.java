package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.Pista;

import java.util.ArrayList;
import java.util.Random;

public class MuyValioso implements Valor {
    @Override
    public int obtenerLargoRuta() {
        return 8;
    }

    @Override
    public Edificio[] obtenerEdificiosConSospechoso(ArrayList<ArrayList> descripcion, Pista pista) {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];
        ArrayList<Pista> dificil = descripcion.get(3);

        Random random_method = new Random();
        int index = random_method.nextInt(dificil.size());
        ArrayList<Integer> usados = new ArrayList<>();

        edificiosArray[0] = pista.obtenerEdificio();


        for(int i = 1; i < 3; i++){
            edificiosArray[i] = dificil.get(index).obtenerEdificio();
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(dificil.size());
            }
        }
        return edificiosArray;
    }

    @Override
    public Edificio[] obtenerEdificios(ArrayList<ArrayList> descripcion) {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];
        ArrayList<Pista> dificil = descripcion.get(3);

        Random random_method = new Random();
        int index = random_method.nextInt(dificil.size());
        ArrayList<Integer> usados = new ArrayList<>();


        for(int i = 0; i < 3; i++){
            edificiosArray[i] = dificil.get(index).obtenerEdificio();
            usados.add(index);
            while (usados.contains(index)){
                index = random_method.nextInt(dificil.size());
            }
        }
        return edificiosArray;
    }


}
