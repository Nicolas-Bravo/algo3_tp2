package edu.fiuba.algo3.modelo;

import javafx.scene.image.Image;

public class Banco extends Edificio {
    private Image imagen;
    public Banco(Pista entrada) {
                super(entrada);
                this.imagen = new Image("https://pngimg.com/uploads/bank/bank_PNG23.png");

    }
    @Override
    public Image obtenerImagen() {
        return this.imagen;
    }



}
