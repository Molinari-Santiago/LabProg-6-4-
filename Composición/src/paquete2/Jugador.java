package paquete2;

public class Jugador {
	private String nombre = "Nene";
	private int edad = 500;
	private int posicion = 1;
	private double efectividad = 0;
	
	public Jugador(String nombre, int edad, int posicion, double efectividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.efectividad = efectividad;
    }
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public double getEfectividad() {
		return efectividad;
	}
	public void setEfectividad(double efectividad) {
		this.efectividad = efectividad;
	}
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", efectividad="
				+ efectividad + "]";
	}
	
}
