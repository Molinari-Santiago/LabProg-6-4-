package paquete;

public abstract class CuentaBancaria {
	protected String titular;
	protected double saldo;
	public CuentaBancaria(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return this.titular;	
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void deposito(double cantidad) {
		this.saldo += cantidad;
	}
	public abstract boolean extraer(double cantidad);
}
