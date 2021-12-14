package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.exceptions.IntentoDeArrestoExecption;
import edu.fiuba.algo3.modelo.reloj.Reloj;

public class EdificioFinal extends Edificio {
    public EdificioFinal(Pista pista){
        super(pista);
    }

    @Override
    public Pista entrar(Reloj reljo) throws IntentoDeArrestoExecption {
        throw new IntentoDeArrestoExecption();
    }
}
