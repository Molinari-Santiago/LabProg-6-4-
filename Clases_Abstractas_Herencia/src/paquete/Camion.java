package paquete;

public class Camion extends CamionetaCarga{

	public Camion(String patente, int precioBase, int diasAlquiler, float pma, Trailer t) {
		super(patente, precioBase, diasAlquiler, pma);
	}

	@Override
	public double calcularPrecioAlquiler(Trailer t) {
		double trailer = t.calcularCosto() * this.getDiasAlquiler();
		double incremento = super.calcularPrecioAlquiler(t);
		return ((incremento + (incremento * 0.4)) + trailer);
	}
}