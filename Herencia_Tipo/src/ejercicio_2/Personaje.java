package ejercicio_2;

public class Personaje {
	private String nombre;
	private int vida;
	private Posicion posicion;
	
	public Personaje(String nombre, int vida, Posicion posicion) {
		this.nombre = nombre;
		this.vida = vida;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}
}
