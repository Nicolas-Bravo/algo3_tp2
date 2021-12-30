package edu.fiuba.algo3.modelo;

import javafx.scene.image.Image;

public class Puerto extends Edificio{
    private Image imagen;
    public Puerto(Pista entrada) {
        super(entrada);
        this.imagen = new Image("https://cdn-icons-png.flaticon.com/32/995/995249.png");

    }
    @Override
    public Image obtenerImagen() {
        return this.imagen;
    }
}