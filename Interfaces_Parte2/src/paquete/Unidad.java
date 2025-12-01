package paquete;


abstract class Unidad {
	protected String equipo;
	protected int costo;
	protected int energia;
	
	public Unidad(String equipo, int costo, int energia) {
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}
	
	public String getEquipo() {
		return equipo;
	}

	public int getCosto() {
		return costo;
	}

	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	abstract void recibeDano(double danoProducido);
}
