package ejercicio_1;

public class Pollito extends Animal implements Emisor_De_Sonido{

	Pollito(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Quak");
	}

}
