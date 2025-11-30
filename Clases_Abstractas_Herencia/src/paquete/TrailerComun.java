package paquete;

public class TrailerComun extends Trailer{
	public TrailerComun(float costoDiario) {
		super(costoDiario);
	}

	@Override
	public double calcularCosto() {
		return this.getCostoDiario();
	}
}}
