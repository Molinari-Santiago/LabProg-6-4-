package paquete2;

public class Prueba {
	  public static void main(String[] args) {
		  Equipo equipo = new Equipo();
		  Jugador jugador = new Jugador("mateo", 17, 10, 10);
		  equipo.toString();
		  jugador.toString();
		  equipo.agregar("mateo", 17, 10, 10);
		  equipo.sacar("mateo", 17, 10, 10);
		  equipo.agregar("nene", 31, 7, 10);
		  equipo.listar();
		  System.out.println( "La cantidad de jugadores que tiene le club es " + equipo.cantidadJugadores());
	  }
}
