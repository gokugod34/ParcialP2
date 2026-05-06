// Ejercicio 1.3
public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 500.0);
        cuenta.depositar(1000.0);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        // Validación: Integridad de datos activa
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("Error: No se pueden depositar montos negativos.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}