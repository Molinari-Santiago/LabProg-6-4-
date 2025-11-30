package paquete;

public abstract class Trailer {
	protected float costoDiario;
	
	public Trailer(float costoDiario) {
		this.costoDiario = costoDiario;
	}
	
	public abstract double calcularCosto();
	
	public float getCostoDiario() {
		return this.costoDiario;
	}
}
