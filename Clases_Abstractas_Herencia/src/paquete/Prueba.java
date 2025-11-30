package paquete;

public class Prueba {
	 public static void main(String[] args) {

	        TrailerComun trailerComun = new TrailerComun(100); // $100 por día
	        TrailerRefrigerado trailerRefrigerado = new TrailerRefrigerado(200, -10); // $200 por día, -10°C
	        
	        Auto auto1 = new Auto("ABC123", 500, 5, 4);
	        System.out.println("Precio alquiler Auto: $" + auto1.calcularPrecioAlquiler(trailerComun));

	        Combi combi1 = new Combi("DEF456", 500, 3, 12);
	        System.out.println("Precio alquiler Combi: $" + combi1.calcularPrecioAlquiler(trailerComun));

	        CamionetaCarga camioneta1 = new CamionetaCarga("GHI789", 500, 4, 1.5);
	        System.out.println("Precio alquiler CamionetaCarga: $" + camioneta1.calcularPrecioAlquiler(trailerComun));

	    }
	}
