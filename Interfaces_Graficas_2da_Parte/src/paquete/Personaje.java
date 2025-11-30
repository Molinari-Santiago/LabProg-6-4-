package paquete;

public class Personaje {
	protected String nombre;
	protected int vitalidad;
	protected double x;
	protected double y;

	public Personaje(String nombre, int vitalidad, double x, double y) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.x = x;
		this.y = y;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getVitalidad() {
		return this.vitalidad;
	}

	public double getPosX() {
		return this.x;
	}

	public double getPosY() {
		return this.y;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void incrementaPos(double valorX, double valorY) {
		this.x += valorX;
		this.y += valorY;
	}
	public double distancia(double valorReferencia) {
		double miMagnitud = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		return Math.abs(miMagnitud - valorReferencia);
	}
	public boolean atacar(Personaje adversario, int alcanceAtaque) {
		double posicionX = adversario.getPosX();
		double posicionY = adversario.getPosY();
		double magnitudAdversario = Math.sqrt(Math.pow(posicionX, 2) + Math.pow(posicionY, 2));
		double distanciaEntrePersonajes = this.distancia(magnitudAdversario);
		return distanciaEntrePersonajes <= alcanceAtaque;
	}

	public void recibeDanio(int cantidad) {
		this.vitalidad = Math.max(0, this.vitalidad - cantidad);
	}
}