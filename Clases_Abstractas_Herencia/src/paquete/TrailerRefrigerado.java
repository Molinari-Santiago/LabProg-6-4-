package paquete;

public class TrailerRefrigerado extends Trailer{
	private float temperaturaMinima;
	public TrailerRefrigerado(float costoDiario, float temperaturaMinima) {
		super(costoDiario);
		this.temperaturaMinima = temperaturaMinima;
	}

	@Override
	public double calcularCosto() {
		return this.getCostoDiario();
	}

	public float getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(float temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
}