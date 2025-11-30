package Ejercicio_3;

public class Personaje implements Dibujable{
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

	@Override
	public void RepresentacionEnConsola() {
		System.out.println("nombre: " + this.nombre + " y posicion en x: " + this.posicion.getPosx() + " y posicion en y: " + this.posicion.getPosy());
		
	}
}
