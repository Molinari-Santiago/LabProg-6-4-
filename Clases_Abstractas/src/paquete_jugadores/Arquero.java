package paquete_jugadores;

public class Arquero extends Jugador{
	private double efectividad;
	public Arquero(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
	}

	@Override
	public double indiceDefensa() {
		return this.efectividad;
	}

	@Override
	public double indiceAtaque() {
		return (0.1 * this.velocidad * this.potencia);
	}

	@Override
	public String toString() {
		return "Arquero [efectividad=" + efectividad + ", indiceDefensa()=" + indiceDefensa() + ", indiceAtaque()="
				+ indiceAtaque() + "]";
	}
	
}
