package paquete;

public class prueba {
	 public static void main(String[] args) {
		 CuentaBancaria c = new CuentaBancaria("mateo", 9999999, 3, 15);
		 c.depositar(99);
		 c.extraer(1);
		 System.out.println(c.toString());
	 }
}
