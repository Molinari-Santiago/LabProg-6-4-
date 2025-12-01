package paquete;

abstract class Unidad implements IComparabe{
	protected String nombre;
	protected String equipo;
	protected int costo;
	protected int energia;
	
	public Unidad(String nombre, String equipo, int costo, int energia) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}
	
	public String getNombre() {
		return nombre;
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

	@Override
	public int compareTo(Unidad otra) {
	    int comparacionEquipo = this.equipo.compareToIgnoreCase(otra.equipo);
	    if (comparacionEquipo != 0) {
	        return comparacionEquipo;
	    }
	    return this.nombre.compareToIgnoreCase(otra.nombre);
	}
	
	abstract void recibeDano(double danoProducido);
}