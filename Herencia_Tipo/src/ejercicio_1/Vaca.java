package ejercicio_1;

public class Vaca extends Animal implements Emisor_De_Sonido{

	Vaca(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Muu");
	}
}
