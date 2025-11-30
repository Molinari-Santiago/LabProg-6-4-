package paquete_jugadores;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        Equipo e = new Equipo("Club A", listaJugadores);

        System.out.println(e.agregarJugador(new Delantero("j1", 1.0, 0.7))); 
        System.out.println(e.agregarJugador(new Defensor("j2", 0.8, 0.5))); 
        System.out.println(e.agregarJugador(new Arquero("j3", 0.1, 0.4))); 
        System.out.println(e.agregarJugador(new Delantero("j4", 0.9, 0.6)));  

        e.mostrarNombresJugadores();
    }
}
