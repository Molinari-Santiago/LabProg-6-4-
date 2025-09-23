package juego_interfaz;

public class Juego{
private String nombre;
private int velocidad;
private int fuerza;
private int resistencia;
private int inteligencia;

public Juego(String nombre,int velocidad, int fuerza, int resistencia, int inteligencia) 
{
super();
this.fuerza=fuerza;
this.inteligencia=inteligencia;
this.resistencia=resistencia;
this.velocidad=velocidad;
this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

public int getFuerza() {
	return fuerza;
}

public void setFuerza(int fuerza) {
	this.fuerza = fuerza;
}

public int getResistencia() {
	return resistencia;
}

public void setResistencia(int resistencia) {
	this.resistencia = resistencia;
}

public int getInteligencia() {
	return inteligencia;
}

public void setInteligencia(int inteligencia) {
	this.inteligencia = inteligencia;
}

public Juego enfrentaFuerza(Juego otro) {
Juego mayor= null;
if(this.getFuerza()> otro.getFuerza())
	mayor=this;
else if (this.getFuerza()< otro.getFuerza())
	mayor=otro;
return mayor;
}
public Juego enfrentaVelocidad(Juego otro) {
Juego mayor= null;
if(this.getVelocidad()> otro.getVelocidad())
	mayor=this;
else if (this.getVelocidad()< otro.getVelocidad())
	mayor=otro;
return mayor;

}
public Juego enfrentaResistencia(Juego otro) {
Juego mayor= null;
if(this.getResistencia()> otro.getResistencia())
	mayor=this;
else if (this.getResistencia()< otro.getResistencia())
	mayor=otro;
return mayor;

}
public Juego enfrentaInteligencia(Juego otro) {
Juego mayor= null;
if(this.getInteligencia()> otro.getInteligencia())
	mayor=this;
else if (this.getInteligencia()< otro.getInteligencia())
	mayor=otro;
return mayor;

}


}