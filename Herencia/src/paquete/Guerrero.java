package paquete;

public class Guerrero extends Personaje {
	protected int alcanceAtaque;
	protected int danioAtaque;
	
	public Guerrero() {
		super("Guerrero", 500, 0, 0);
		this.alcanceAtaque = 10;
		this.danioAtaque = 10;
	}
}