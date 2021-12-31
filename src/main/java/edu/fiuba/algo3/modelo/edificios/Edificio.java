package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.demorador.DemoradorPorEntradas;
import edu.fiuba.algo3.modelo.demorador.PrimerEntrada;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import javafx.scene.image.Image;

public abstract class Edificio {

    protected final Pista pista;
    private DemoradorPorEntradas demorador;

    public Edificio(Pista entrada){
        this.pista = entrada;
        this.demorador = new PrimerEntrada();
    }

    public Pista entrar(Reloj reloj) {
        this.demorador = demorador.demoraTemporal(reloj);
        return this.pista;
    }

    abstract public String obtenerImagen();
}

