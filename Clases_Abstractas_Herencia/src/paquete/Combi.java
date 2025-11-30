package paquete;

public class Combi extends Auto{
	public Combi(String patente, int precioBase, int diasAlquiler, int plazas) {
		super(patente, precioBase, diasAlquiler, plazas);
	}

	@Override
	public double calcularPrecioAlquiler(Trailer t) {
		double incremento = (this.getPrecioBase() * 0.02) * this.plazas;
		return (this.getPrecioBase() + incremento);
	}
}