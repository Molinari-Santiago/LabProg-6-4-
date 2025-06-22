package paquete2;

public class Prueba2 {
public static void main(String[] args) {
CuentaBancaria cuenta1 = new CuentaBancaria();
CuentaBancaria cuenta2 = new CuentaBancaria();
cuenta1.setTitular("Andres");		
cuenta1.depositar(100);  
cuenta1.extraer(200);    

System.out.println(
"Hola " + cuenta1.getTitular() +", tu saldo es " + cuenta1.getSaldo() +", tu cantidad de depósitos es " + cuenta1.getcantidadDepositos() +", tu cantidad de extracciones es " + cuenta1.getcantidadExtraccciones());
cuenta2.setTitular("Moli");
cuenta2.depositar(1000);
cuenta2.extraer(500);
		 
System.out.println(
"Hola " + cuenta2.getTitular() +", tu saldo es " + cuenta2.getSaldo() +", tu cantidad de depósitos es " + cuenta2.getcantidadDepositos() +", tu cantidad de extracciones es " + cuenta2.getcantidadExtraccciones());
}
}