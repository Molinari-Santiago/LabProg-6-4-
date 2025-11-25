package paquete;

public class Mago extends Personaje {
	protected int cantidadMagia;
	protected int alcanceLargo;
	protected int danioLargo;
	protected int alcanceCorto;
	protected int danioCorto;

	public Mago() {
		super("Mago", 300, 0, 0);
		this.cantidadMagia = 5000;
		this.alcanceLargo = 100;
		this.danioLargo = 10;
		this.alcanceCorto = 5;
		this.danioCorto = 3;
	}

	public void recuperarMagia(int cantidad) {
		this.cantidadMagia += cantidad;
	}
	
	public void telentransportar(double valorX, double valorY) {
		if (cantidadMagia > 2000) {
			this.x = valorX;
			this.y = valorY;
			cantidadMagia -= 2000;
		}
	}

	public void curar(int cantidad, Personaje curado) {
		if (cantidadMagia > 1000) {
			curado.vitalidad += 100;
			cantidadMagia -= 1000;
			
		}
	}
	@Override
	public boolean atacar(Personaje adversario, int alcanceAtaque) {
		double posicionX = adversario.getPosX();
		double posicionY = adversario.getPosY();
		double magnitudAdversario = Math.sqrt(Math.pow(posicionX, 2) + Math.pow(posicionY, 2));
		double distanciaEntrePersonajes = this.distancia(magnitudAdversario);

		if (distanciaEntrePersonajes <= this.alcanceCorto) {
			adversario.recibeDanio(this.danioCorto);
			return true;
		} else if (distanciaEntrePersonajes <= this.alcanceLargo && this.cantidadMagia > 0) {
			this.cantidadMagia -= 500;
			adversario.recibeDanio(this.danioLargo);
			return true;
		}
		return false;
	}
}