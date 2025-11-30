package paquete;

public class CuentaCorriente extends CuentaBancaria {
	private double giroEnDescubierto;
	public CuentaCorriente(String titular) {
		super(titular);
	}
	public double getGiroEnDescubierto() {
		return this.giroEnDescubierto;
	}
	public void setGiroEnDescubierto(double giroEnDescubierto) {
		this.giroEnDescubierto = giroEnDescubierto;
	}
	@Override
	public boolean extraer(double cantidad) {
		boolean respuesta = false;
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
			respuesta = true;
		} else if ((this.saldo + this.giroEnDescubierto) >= cantidad) {
			this.saldo -= cantidad;
			this.giroEnDescubierto += this.saldo;
			respuesta = true;
		}
		return respuesta;
	}
	
}

