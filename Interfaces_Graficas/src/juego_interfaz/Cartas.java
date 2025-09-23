package juego_interfaz;

import java.util.ArrayList;
import java.util.Iterator;

public class Cartas
{
private ArrayList<Juego> heroes= new ArrayList<Juego>();
public void agregarHeroe(Juego h) {
this.heroes.add(h);
}
public void eliminarHeroe(Juego h) {
	this.heroes.remove(h);
	
}
public Iterator<Juego> getHeroes(){
	return this.heroes.iterator();
}
public Juego enfrentar (Juego h1, Juego h2, String atributo) {
	Juego resultado= null;
	if(atributo.equalsIgnoreCase("Fuerza")) {
		resultado= h1.enfrentaFuerza(h2);
	}
	else if(atributo.equalsIgnoreCase("Velocidad")) {
		resultado= h1.enfrentaVelocidad(h2);
	}
	else if(atributo.equalsIgnoreCase("Inteligencia")) {
		resultado= h1.enfrentaInteligencia(h2);
	}
	else if(atributo.equalsIgnoreCase("Resstencia")) {
		resultado= h1.enfrentaResistencia(h2);
	}
	

		return resultado;}
}
