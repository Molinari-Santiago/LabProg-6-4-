package ejercicio_1;

public class Ambulancia extends Vehiculo implements Emisor_de_Sonido{

	public Ambulancia(String Patente, String numeroChasis, String numeroMotor) {
		super(Patente, numeroChasis, numeroMotor);
	}

	public void emiteSonido() {
		System.out.println("sirena sonando");
	}

}
