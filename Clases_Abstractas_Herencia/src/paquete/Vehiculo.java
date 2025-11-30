package paquete;

public abstract class Vehiculo {
	protected String patente;
	protected int precioBase = 500;
	protected int diasAlquiler;
	
	public Vehiculo(String patente, int precioBase, int diasAlquiler) {
		this.patente = patente;
		this.precioBase = precioBase;
		this.diasAlquiler = diasAlquiler;
	}

	public String getPatente() {
		return patente;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}
	
	public abstract double calcularPrecioAlquiler(Trailer t);
}