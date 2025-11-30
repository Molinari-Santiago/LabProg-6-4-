package paquete;

public class CajaDeAhorro extends CuentaBancaria{
	private int cantidadExtracciones;
	public CajaDeAhorro(String titular) {
		super(titular);
	}
	@Override
	public boolean extraer(double cantidad) {
		boolean respuesta = false;
		if (this.cantidadExtracciones > 0 && this.saldo >= cantidad) {
			this.cantidadExtracciones--;
			this.saldo -= cantidad;
			respuesta = true;
		}
		return respuesta;
	}
}
