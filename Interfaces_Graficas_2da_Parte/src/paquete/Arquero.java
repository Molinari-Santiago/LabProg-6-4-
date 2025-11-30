package paquete;

public class Arquero extends Personaje {
	protected int cantidadFlechas;
	protected int alcanceLargo;
	protected int danioLargo;
	protected int alcanceCorto;
	protected int danioCorto;

	public Arquero() {
		super("Arquero", 400, 0, 0);
		this.cantidadFlechas = 20;
		this.alcanceLargo = 100;
		this.danioLargo = 20;
		this.alcanceCorto = 5;
		this.danioCorto = 5;
	}

	public void agregarFlechas(int cantidad) {
		this.cantidadFlechas += cantidad;
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
		} else if (distanciaEntrePersonajes <= this.alcanceLargo && this.cantidadFlechas > 0) {
			this.cantidadFlechas--;
			adversario.recibeDanio(this.danioLargo);
			return true;
		}
		return false;
	}
}