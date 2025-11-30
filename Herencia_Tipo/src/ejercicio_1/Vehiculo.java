package ejercicio_1;

public class Vehiculo{
	private String Patente;
	private String numeroChasis;
	private String numeroMotor;
	
	public Vehiculo(String Patente, String numeroChasis, String numeroMotor) {
		this.Patente = Patente;
		this.numeroChasis = numeroChasis;
		this.numeroMotor = numeroMotor;
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public String getNumeroChasis() {
		return numeroChasis;
	}

	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	public String getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}	
}
