package paquete;

public class CamionetaCarga extends Vehiculo{
	protected double pma;
	public CamionetaCarga(String patente, int precioBase, int diasAlquiler, double d) {
		super(patente, precioBase, diasAlquiler);
		this.pma = d;
	}

	@Override
	public double calcularPrecioAlquiler(Trailer t) {
		double incremento = (pma * 0.2 * this.getDiasAlquiler());
		return (incremento + this.getPrecioBase());
	}
}