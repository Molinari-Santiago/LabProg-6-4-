package paquete;

public class TestCuentas {

public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaUniversitaria("moli");
		c1.deposito(700);
		System.out.println(c1);
		c1.extraer(300);
		System.out.println(c1);
		c1.extraer(300);
		System.out.println(c1);
		c1.extraer(700);
		System.out.println(c1);
		
		
		CuentaBancaria c2 = new CuentaCorriente("tomi");
		System.out.println(c2);
		c2.extraer(300);
		System.out.println(c2);
		c2.extraer(300);
		System.out.println(c2);
		c2.extraer(700);
		System.out.println(c2);
		
		CuentaBancaria c3 = new CajaDeAhorro("cechi");
		System.out.println(c3);
		c3.extraer(300);
		System.out.println(c3);
		c3.extraer(300);
		System.out.println(c3);
		c3.extraer(700);
		System.out.println(c3);
	}
}

