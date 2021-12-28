package edu.fiuba.algo3.modelo.valor;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.pista.Pista;

import java.util.ArrayList;

public class MuyValioso implements Valor {
    @Override
    public int obtenerLargoRuta() {
        return 7;
    }

    @Override
    public Edificio[] obtenerEdificios(ArrayList<ArrayList> descripcion) {
        Edificio[] edificiosArray;
        edificiosArray = new Edificio[3];
        ArrayList<Pista> facil = descripcion.get(3);

        for(int i = 0; i < 3; i++){
            edificiosArray[i] = facil.get((int) (Math.random() * facil.size())).obtenerEdificio();
        }
        return edificiosArray;
    }
}
