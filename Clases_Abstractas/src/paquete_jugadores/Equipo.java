package paquete_jugadores;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	
	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public String agregaDelantero(String nombre, double velocidad, double potencia) {
		if (velocidad < 1 && velocidad > 0 && potencia < 1 && potencia > 0) {
	    jugadores.add(new Delantero(nombre, velocidad, potencia));
	    return "Jugador agregado";
		} else {
			return "Imposible crear un jugador";
		}
	}
	
	public String agregaDefensor(String nombre, double velocidad, double potencia) {
		if (velocidad < 1 && velocidad > 0 && potencia < 1 && potencia > 0) {
	    jugadores.add(new Defensor(nombre, velocidad, potencia));
	    return "Jugador agregado";
		} else {
			return "Imposible crear un jugador";
		}
	}
	
	public String agregaArquero(String nombre, double velocidad, double potencia) {
		if (velocidad < 1 && velocidad > 0 && potencia < 1 && potencia > 0) {
	    jugadores.add(new Arquero(nombre, velocidad, potencia));
	    return "Jugador agregado";
		} else {
			return "Imposible crear un jugador";
		}
	}
	
	public String agregarJugador(Jugador jugador) {
	    if (jugador.getVelocidad() > 0 && jugador.getVelocidad() < 1 &&
	        jugador.getPotencia() > 0 && jugador.getPotencia() < 1) {

	        jugadores.add(jugador);
	        return "Jugador agregado";
	    } else {
	        return "Imposible crear un jugador";
	    }
	}

	void eliminaJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
	
	public void mostrarNombresJugadores() {
	    for (Jugador j : jugadores) {
	        System.out.println(j.getNombre());
	    }
	}
	
	public double indiceDefensa() {
		double indicedefensa = 0;
		for (Jugador j : jugadores) {
			indicedefensa += j.indiceDefensa();
	    }
		return indicedefensa;
	}
	
	public double indiceAtaque () {
		double indiceataque = 0;
		for (Jugador j : jugadores) {
			indiceataque += j.indiceAtaque();
	    }
		return indiceataque;
	}
	@Override
	public String toString() {
		return "Equipo [getNombre()=" + getNombre() + ", indiceDefensa()=" + indiceDefensa() + ", indiceAtaque()="
				+ indiceAtaque() + "]";
	}
	
}	
