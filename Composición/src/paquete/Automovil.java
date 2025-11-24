package paquete;

public class Automovil {
private String marca;
private int modelo;
private Motor motor = new Motor();
private Chasis chasis = new Chasis();
private double precio;
	
public String getMarca() {
return this.marca;
}
public int getModelo() {
return this.modelo;
}
public Motor getMotor () {
return this.motor;
}
public Chasis getChasis () {
return this.chasis;
}
public void setPrecio(double precio) {
this.precio = precio;
}
public String getTipoCombustible() {
return motor.getTipoCombustible();
}
public double getCilindrada() {
return motor.getCilindrada();
}
	public String toString() {
		return ("Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis
				+ ", precio=" + precio + "]" + motor.toString() + chasis.toString());
	}
}
