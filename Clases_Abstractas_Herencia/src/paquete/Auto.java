package paquete;

public class Auto extends Vehiculo{
	protected int plazas;
	
	public Auto(String patente, int precioBase, int diasAlquiler, int plazas) {
		super(patente, precioBase, diasAlquiler);
		this.plazas = plazas;
	}

	@Override
	public double calcularPrecioAlquiler(Trailer t) {
		double incremento = (this.getPrecioBase() * 0.015) * this.plazas;
		return (this.getPrecioBase() + incremento);
	}
}