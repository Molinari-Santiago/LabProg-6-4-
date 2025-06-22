package paquete;

public class Prueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		System.out.println("Hola " + persona1.getNombre() + " , tu edad es " + persona1.getEdad() + " y tu Gmail es " + persona1.getGmail());
		Persona persona2 = new Persona();
		persona2.setNombre("moli");
		persona2.setEdad(17);
		persona2.setGmail("moli@gmail.com");

		System.out.println("Hola " + persona2.getNombre() + ", tu edad es " + persona2.getEdad() + " y tu Gmail es " + persona2.getGmail());

	}
}