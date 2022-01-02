package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.core.*;
import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.pistas.*;
import edu.fiuba.algo3.modelo.rangos.*;
import edu.fiuba.algo3.modelo.valor.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegracionTest {

    @Test
    public void tesoroValorComunRobado(){

        Tesoro tesoro = new Tesoro(new PistaGeneral("teosro"), new PistaGeneral("montreal"), new Comun());

        Edificio montrealUno = new Banco(new PistaEconomica("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new PistaPuerto("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new PistaBiblioteca("Una pista aux"));
        Destino montreal = new Destino(new PistaGeneral("Montreal"), new Coordenadas(45.50884, -73.5878), montrealUno, montrealDos, montrealTres);

        Edificio limaUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio limaDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino lima = new Destino(new PistaGeneral("Lima"), new Coordenadas(12.04318, 77.02824) , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio londresDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino londres = new Destino(new PistaGeneral("Londres"), new Coordenadas(51.50853, 0.12574) , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio mexicoDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino mexico = new Destino(new PistaGeneral("Mexico"),  new Coordenadas(19.42847, -99.12766) , mexicoUno, mexicoDos, mexicoTres);

        Edificio atenasUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio atenasDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio atenasTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino atenas = new Destino(new PistaGeneral("Atenas"), new Coordenadas(37.98376, 23.72784) , atenasUno, atenasDos, atenasTres);

        RutaDeEscape ruta = new RutaDeEscape(montreal, lima, londres, mexico, atenas);

        Caso caso = new Caso(new PistaGeneral("Fast Eddie B."), tesoro, ruta);

        Policia novato = new Policia("Esteban", new Novato());

        novato.asignarCaso(caso);
        novato.emitirOrdenDeArresto(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Convertible"),
                new PistaGeneral("Negro"),
                new PistaGeneral("Joyeria") );

        novato.viajar(lima);

        novato.viajar(londres);

        novato.viajar(mexico);

        novato.viajar((atenas));

        novato.entrar(atenasUno);

        assertEquals(0,novato.cantidadDeArrestos());

        novato.entrar(atenasDos);
        assertEquals(1, novato.cantidadDeArrestos());
    }

    @Test
    public void tesoroValorValiosoRobado(){

        Tesoro tesoro = new Tesoro(new PistaGeneral("teosro"), new PistaGeneral("montreal"), new Valioso());

        Edificio montrealUno = new Banco(new PistaEconomica("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new PistaPuerto("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new PistaBiblioteca("Una pista aux"));
        Destino montreal = new Destino(new PistaGeneral("Montreal"), new Coordenadas(45.50884, -73.5878), montrealUno, montrealDos, montrealTres);

        Edificio limaUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio limaDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino lima = new Destino(new PistaGeneral("Lima"), new Coordenadas(12.04318, 77.02824) , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio londresDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino londres = new Destino(new PistaGeneral("Londres"), new Coordenadas(51.50853, 0.12574) , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio mexicoDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino mexico = new Destino(new PistaGeneral("Mexico"),  new Coordenadas(19.42847, -99.12766) , mexicoUno, mexicoDos, mexicoTres);

        Edificio atenasUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio atenasDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio atenasTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino atenas = new Destino(new PistaGeneral("Atenas"), new Coordenadas(37.98376, 23.72784) , atenasUno, atenasDos, atenasTres);

        Edificio bangkokUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio bangkokDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio bangkokTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino bangkok = new Destino(new PistaGeneral("Bangkok"), new Coordenadas(100.5014400, 13.7539800) , bangkokUno, bangkokDos, bangkokTres);

        RutaDeEscape ruta = new RutaDeEscape(montreal, lima, londres, mexico, atenas, bangkok);

        Caso caso = new Caso(new PistaGeneral("Fast Eddie B."), tesoro, ruta);

        Policia detective = new Policia("Esteban", new Detective());

        detective.asignarCaso(caso);
        detective.emitirOrdenDeArresto(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Convertible"),
                new PistaGeneral("Negro"),
                new PistaGeneral("Joyeria") );

        detective.viajar(lima);

        detective.viajar(londres);

        detective.viajar(mexico);

        detective.viajar(atenas);

        detective.viajar(bangkok);

        detective.entrar(bangkokUno);

        assertEquals(5,detective.cantidadDeArrestos());

        detective.entrar(bangkokDos);
        assertEquals(6, detective.cantidadDeArrestos());
    }


    @Test
    public void tesoroValorMuyValiosoRobado(){

        Tesoro tesoro = new Tesoro(new PistaGeneral("teosro"), new PistaGeneral("montreal"), new MuyValioso());

        Edificio montrealUno = new Banco(new PistaEconomica("Una pista aux"));
        Edificio montrealDos = new Aeropuerto(new PistaPuerto("Una pista aux"));
        Edificio montrealTres = new Biblioteca(new PistaBiblioteca("Una pista aux"));
        Destino montreal = new Destino(new PistaGeneral("Montreal"), new Coordenadas(45.50884, -73.5878), montrealUno, montrealDos, montrealTres);

        Edificio limaUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio limaDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio limaTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino lima = new Destino(new PistaGeneral("Lima"), new Coordenadas(12.04318, 77.02824) , limaUno, limaDos, limaTres);

        Edificio londresUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio londresDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio londresTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino londres = new Destino(new PistaGeneral("Londres"), new Coordenadas(51.50853, 0.12574) , londresUno, londresDos, londresTres);

        Edificio mexicoUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio mexicoDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio mexicoTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino mexico = new Destino(new PistaGeneral("Mexico"),  new Coordenadas(19.42847, -99.12766) , mexicoUno, mexicoDos, mexicoTres);

        Edificio atenasUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio atenasDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio atenasTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino atenas = new Destino(new PistaGeneral("Atenas"), new Coordenadas(37.98376, 23.72784) , atenasUno, atenasDos, atenasTres);

        Edificio bangkokUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio bangkokDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio bangkokTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino bangkok = new Destino(new PistaGeneral("Bangkok"), new Coordenadas(100.5014400, 13.7539800) , bangkokUno, bangkokDos, bangkokTres);

        Edificio budapestUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio budapestDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio budapestTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino budapest = new Destino(new PistaGeneral("Budapest"), new Coordenadas(47.49835, 19.04045) , budapestUno, budapestDos, budapestTres);

        Edificio tokyoUno = new Aeropuerto(new PistaPuerto("Otra pista aux"));
        Edificio tokyoDos = new Banco(new PistaEconomica("Otra pista aux"));
        Edificio tokyoTres = new Biblioteca(new PistaBiblioteca("Otra pista aux"));
        Destino tokyo = new Destino(new PistaGeneral("Budapest"), new Coordenadas(139.69171, 35.68950) , tokyoUno, tokyoDos, tokyoTres);

        RutaDeEscape ruta = new RutaDeEscape(montreal, lima, londres, mexico, atenas, bangkok, budapest, tokyo);

        Caso caso = new Caso(new PistaGeneral("Fast Eddie B."), tesoro, ruta);

        Policia sargento = new Policia("Esteban", new Sargento());

        sargento.asignarCaso(caso);
        sargento.emitirOrdenDeArresto(
                new PistaGeneral("Masculino"),
                new PistaGeneral("Croquet"),
                new PistaGeneral("Convertible"),
                new PistaGeneral("Negro"),
                new PistaGeneral("Joyeria") );

        sargento.viajar(lima);

        sargento.viajar(londres);

        sargento.viajar(mexico);

        sargento.viajar(atenas);

        sargento.viajar(bangkok);

        sargento.viajar(budapest);

        sargento.viajar(tokyo);

        sargento.entrar(tokyoUno);

        assertEquals(20,sargento.cantidadDeArrestos());

        sargento.entrar(tokyoDos);
        assertEquals(21, sargento.cantidadDeArrestos());
    }
}
