package paquete;

public class Guerrero {
	private String nombre;
	private double vitalidad = 500;
	private double armadura = 800;
	private double x;
	private double y;
	
	public Guerrero(String nombre) {
		this.nombre = nombre;
	}
	public Guerrero(String nombre, double x, double y) {
		this.nombre = nombre;
		this.x = x;
		this.y = y;
	}
	public void mover(double inc_x,double inc_y) {
		this.x = inc_x;
		this.y = inc_y;
;	}
	public void recibeDano (double cantidad){
		this.vitalidad -= cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public double getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}
	public double getArmadura() {
		return armadura;
	}
	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Guerrero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", x=" + x
				+ ", y=" + y + ", getNombre()=" + getNombre() + ", getVitalidad()=" + getVitalidad()
				+ ", getArmadura()=" + getArmadura() + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
}
