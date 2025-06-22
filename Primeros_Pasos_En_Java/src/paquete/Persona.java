package paquete;

public class Persona {
private String nombre = "Andres";
private int edad =47;
private String Gmail = "andres@gmail.com";

public String getNombre() {
return nombre;
}
public int getEdad() {
return edad;
}
public String getGmail() {
return Gmail;
}
public void setNombre(String nombre) {
this.nombre=nombre;
} 
public void setEdad(int edad) {
this.edad=edad;
}
public void setGmail(String gmail) {
this.Gmail=gmail;
}
public boolean sosMayor() {
if (this.edad >= 18) return true;
else return false;
}
public int repeticionesDeLetra(char letra) {
int cantidad = 0;
for (int i = 0; i < nombre.length(); i++) {
if (this.nombre.charAt(i) == letra) cantidad++;
}
return cantidad;
}
};