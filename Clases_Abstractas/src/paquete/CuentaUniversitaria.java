package paquete;

public class CuentaUniversitaria extends CuentaBancaria{
	private int acumuladorDiario = 0;
	public CuentaUniversitaria(String titular) {
		super(titular);
	}

	@Override
	public boolean extraer(double cantidad) {
		boolean respuesta = false;
		if (this.acumuladorDiario + cantidad <= 1000 && cantidad <= this.saldo) {
			this.saldo -= cantidad;
			this.acumuladorDiario += cantidad;
			respuesta = true;
		}
		return respuesta;
	}
	public void resetAcumuladorDiario() {
		this.acumuladorDiario = 0;
	}
}

