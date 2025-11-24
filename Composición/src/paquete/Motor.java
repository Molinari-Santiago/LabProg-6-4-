package paquete;

public class Motor {
	private String Nserie = "serie";
	private double cilindrada = 4;
	private String TipoCombustible = "PRO";
	
	public String getNserie() {
		return this.Nserie;
	}
	public double getCilindrada() {
		return this.cilindrada;
	}
	public String getTipoCombustible() {
		return this.TipoCombustible;
	}
	public String toString() {
		return "Motor [Nserie=" + Nserie + ", cilindrada=" + cilindrada + ", TipoCombustible=" + TipoCombustible + "]";
	}
	
}
