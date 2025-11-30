package Ejercicio_3;

public class Posicion implements Movible{
	private int x;
	private int y;
	
	public Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getPosx() {
		return this.x;
	}

	@Override
	public int getPosy() {
		return this.y;
	}

	@Override
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void incrementaPos(int valorX, int valorY) {
		this.x += x;
		this.y += y;
	}
}