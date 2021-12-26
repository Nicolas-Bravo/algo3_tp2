package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.rango.*;
import edu.fiuba.algo3.modelo.valor.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegracionTest {

    @Test
    public void tesoroValorComunRobado(){

        Edificio montrealUno = new Banco(new Pista("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new Pista("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new Pista("Una pista aux"));
        Destino montreal = new Destino("Montreal", 45.50884, 73.5878, montrealUno, montrealDos, montrealTres);

        Tesoro tesoro = new Tesoro(montreal, new Comun());

        Edificio limaUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio limaDos = new Banco(new Pista("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino lima = new Destino("Lima", 12.04318, 77.02824 , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio londresDos = new Banco(new Pista("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino londres = new Destino("Londres", 51.50853, 0.12574 , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio mexicoDos = new Banco(new Pista("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino mexico = new Destino("Mexico", 19.42847, 99.12766 , mexicoUno, mexicoDos, mexicoTres);

        RutaDeEscape ruta = new RutaDeEscape(lima, londres, mexico);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia novato = new Policia("Esteban", new Novato());

        novato.asignarCaso(caso);
        novato.emitirOrdenDeArresto(
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Convertible"),
                new Pista("Negro"),
                new Pista("Joyeria") );

        novato.viajar(lima);

        novato.viajar(londres);

        novato.viajar(mexico);

        novato.entrar(mexicoUno);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(mexicoDos);
        assertEquals(1, novato.cantidadDeArrestos());
    }

    @Test
    public void tesoroValorValiosoRobado(){

        Edificio montrealUno = new Banco(new Pista("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new Pista("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new Pista("Una pista aux"));
        Destino montreal = new Destino("Montreal", 45.50884, 73.5878, montrealUno, montrealDos, montrealTres);

        Tesoro tesoro = new Tesoro(montreal, new Valioso());

        Edificio limaUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio limaDos = new Banco(new Pista("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino lima = new Destino("Lima", 12.04318, 77.02824 , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio londresDos = new Banco(new Pista("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino londres = new Destino("Londres", 51.50853, 0.12574 , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio mexicoDos = new Banco(new Pista("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino mexico = new Destino("Mexico", 19.42847, 99.12766 , mexicoUno, mexicoDos, mexicoTres);

        Edificio atenasUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio atenasDos = new Banco(new Pista("Otra pista aux"));
        Edificio atenasTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino atenas = new Destino("Atenas", 37.98376, 23.72784 , atenasUno, atenasDos, atenasTres);

        RutaDeEscape ruta = new RutaDeEscape(lima, londres, mexico, atenas);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia detective = new Policia("Esteban", new Detective());

        detective.asignarCaso(caso);
        detective.emitirOrdenDeArresto(
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Convertible"),
                new Pista("Negro"),
                new Pista("Joyeria") );

        detective.viajar(lima);

        detective.viajar(londres);

        detective.viajar(mexico);

        detective.viajar(atenas);

        detective.entrar(atenasUno);

        assertEquals(5,detective.cantidadDeArrestos());

        detective.entrar(atenasDos);
        assertEquals(6, detective.cantidadDeArrestos());
    }


    @Test
    public void tesoroValorMuyValiosoRobado(){

        Edificio montrealUno = new Banco(new Pista("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new Pista("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new Pista("Una pista aux"));
        Destino montreal = new Destino("Montreal", 45.50884, 73.5878, montrealUno, montrealDos, montrealTres);

        Tesoro tesoro = new Tesoro(montreal, new MuyValioso());

        Edificio limaUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio limaDos = new Banco(new Pista("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino lima = new Destino("Lima", 12.04318, 77.02824 , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio londresDos = new Banco(new Pista("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino londres = new Destino("Londres", 51.50853, 0.12574 , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio mexicoDos = new Banco(new Pista("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino mexico = new Destino("Mexico", 19.42847, 99.12766 , mexicoUno, mexicoDos, mexicoTres);

        Edificio atenasUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio atenasDos = new Banco(new Pista("Otra pista aux"));
        Edificio atenasTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino atenas = new Destino("Atenas", 37.98376, 23.72784 , atenasUno, atenasDos, atenasTres);

        Edificio bangkokUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio bangkokDos = new Banco(new Pista("Otra pista aux"));
        Edificio bangkokTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino bangkok = new Destino("Bangkok", 100.5014400, 13.7539800 , bangkokUno, bangkokDos, bangkokTres);

        Edificio budapestUno = new Aeropuerto(new Pista("Otra pista aux"));
        Edificio budapestDos = new Banco(new Pista("Otra pista aux"));
        Edificio budapestTres = new Biblioteca(new Pista("Otra pista aux"));
        Destino budapest = new Destino("Budapest", 47.49835, 19.04045 , budapestUno, budapestDos, budapestTres);

        RutaDeEscape ruta = new RutaDeEscape(lima, londres, mexico, atenas, bangkok, budapest);

        Caso caso = new Caso("Fast Eddie B.", tesoro, ruta);

        Policia sargento = new Policia("Esteban", new Sargento());

        sargento.asignarCaso(caso);
        sargento.emitirOrdenDeArresto(
                new Pista("Masculino"),
                new Pista("Croquet"),
                new Pista("Convertible"),
                new Pista("Negro"),
                new Pista("Joyeria") );

        sargento.viajar(lima);

        sargento.viajar(londres);

        sargento.viajar(mexico);

        sargento.viajar(atenas);

        sargento.viajar(bangkok);

        sargento.viajar(budapest);

        sargento.entrar(budapestUno);

        assertEquals(20,sargento.cantidadDeArrestos());

        sargento.entrar(budapestDos);
        assertEquals(21, sargento.cantidadDeArrestos());
    }
}
