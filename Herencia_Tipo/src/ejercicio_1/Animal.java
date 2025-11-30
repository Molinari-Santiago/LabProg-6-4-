package ejercicio_1;

public class Animal{
	private String nombre;
	private String sonido;
	
	Animal(String nombre, String sonido){
		this.nombre = nombre;
		this.sonido = sonido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSonido() {
		return sonido;
	}

}
