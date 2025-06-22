package paquete2;

public class CuentaBancaria {
private String titular;
private double saldo;
private int cantidadDepositos;
private int cantidadExtracciones;
	
public String getTitular() {
return titular;
}
public double getSaldo() {
return saldo;
}
public int getcantidadDepositos() {
return cantidadDepositos;
}
public int getcantidadExtraccciones() {
return cantidadExtracciones;
}
public void setTitular(String titular) {
this.titular = titular;
}
public void depositar(double cantidad) {
this.saldo += cantidad;
this.cantidadDepositos ++;
}
public boolean extraer(double cantidad) {
if (this.saldo >= cantidad) {
this.saldo -= cantidad;
this.cantidadExtracciones++;
return true;
} else return false;
}
};
