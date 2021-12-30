package edu.fiuba.algo3.modelo;

import javafx.scene.image.Image;

public class Banco extends Edificio {
    private Image imagen;
    public Banco(Pista entrada) {
                super(entrada);
                this.imagen = new Image("https://cdn-icons-png.flaticon.com/32/2830/2830284.png");

    }
    @Override
    public Image obtenerImagen() {
        return this.imagen;
    }



}
