package paquete3;

public class Guerrero {
private String nombre;
private double vitalidad;
private double armadura;
private double x;
private double y;
	
public String getNombre() {
return nombre;
}
public double getVitalidad() {
return vitalidad;
}
public double getArmadura() {
return armadura;
}
public double getX() {
return x;
}
public double getY() {
return y;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public void setVitalidad(double vitalidad) {
this.vitalidad = vitalidad;
}
public void setArmadura(double armadura) {
this.armadura = armadura;
}
public void setX(double x) {
this.x = x;
}
public void setY(double y) {
this.y = y;
}
public void mover(double inc_x, double inc_y) {
this.x += inc_x;
this.y += inc_y;
}
public void recibeDano(double cantidad) {
if (this.armadura >= cantidad) {
this.armadura -= cantidad;
} else {
cantidad -= this.armadura;
this.vitalidad -= cantidad;
this.armadura = 0;	
}
}
}
