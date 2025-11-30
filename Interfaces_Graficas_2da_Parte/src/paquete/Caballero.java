package paquete;

public class Caballero extends Personaje {
	protected int alcanceAtaque;
	protected int danioAtaque;
	protected int armadura;
	
	public Caballero() {
		super("Caballero", 800, 0, 0);
		this.alcanceAtaque = 10;
		this.danioAtaque = 10;
		this.armadura = 500;
	}

	@Override
	public void recibeDanio(int cantidad) {
		if (cantidad > this.armadura) vitalidad -= (cantidad - this.armadura);
		else armadura -= cantidad;
	}
}