package paquete;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int cantidadDepositos;
    private int cantidadExtracciones;

    public CuentaBancaria(String titular, double saldo, int cantidadDepositos, int cantidadExtracciones) {
        this.titular = titular;
        this.saldo = saldo;
        this.cantidadDepositos = cantidadDepositos;
        this.cantidadExtracciones = cantidadExtracciones;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getCantidadDepositos() {
        return this.cantidadDepositos;
    }

    public int getCantidadExtracciones() {
        return this.cantidadExtracciones;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            this.cantidadDepositos++;
        }
    }

    public boolean extraer(double cantidad) {
        if (this.saldo < cantidad) {
            return false;
        } else {
            this.saldo -= cantidad;
            this.cantidadExtracciones++;
            return true;
        }
    }

    public String toString() {
        return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
                + ", cantidadExtracciones=" + cantidadExtracciones + "]";
    }
}
