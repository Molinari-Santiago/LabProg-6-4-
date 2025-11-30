package ejercicio_1;

public class Gato extends Animal implements Emisor_De_Sonido{

	Gato(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Miau");
	}
}
