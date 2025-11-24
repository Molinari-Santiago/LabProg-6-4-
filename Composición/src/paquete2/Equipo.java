package paquete2;
import java.util.ArrayList;

public class Equipo {
	private String nombre = "Ferro";
	private int anoCreacion = 1954;
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	public String getNombre() {
		return nombre;
	}
	public int getAnoCreacion() {
		return anoCreacion;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public ArrayList<Jugador> agregar(String nombre, int edad, int posicion, double efectividad) {
        jugadores.add(new Jugador(nombre, edad, posicion, efectividad));
        return jugadores;
    }
	public ArrayList<Jugador> sacar(String nombre, int edad, int posicion, double efectividad){
		for (int i = 0; i < jugadores.size(); i++) {
	        Jugador jugador = jugadores.get(i);
	        if (jugador.getNombre().equals(nombre) &&
	            jugador.getEdad() == edad &&
	            jugador.getPosicion() == posicion &&
	            jugador.getEfectividad() == efectividad) {
	            jugadores.remove(i);
	            return jugadores;
	        }
	    } 
		  return jugadores;
	}
	public int cantidadJugadores(){
		return (jugadores.size());
	}
	public void listar() {
		for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador.getNombre() + 
                               " | Edad: " + jugador.getEdad() +
                               " | Posición: " + jugador.getPosicion() +
                               " | Efectividad: " + jugador.getEfectividad());
        }
	}
	public String toString() {
		return ("Equipo [nombre=" + nombre + ", anoCreacion=" + anoCreacion + ", jugadores=" + jugadores
				+ ", cantidadJugadores()=" + cantidadJugadores() + "]");
	}
	
}
