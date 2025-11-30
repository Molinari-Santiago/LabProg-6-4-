package ejercicio_1;

public class Perro extends Animal implements Emisor_De_Sonido{

	Perro(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Guau");
	}
}
