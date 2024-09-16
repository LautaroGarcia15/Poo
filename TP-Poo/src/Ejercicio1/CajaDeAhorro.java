package Ejercicio1;

// Clase CajaDeAhorro
class CajaDeAhorro {
    private int numeroCuenta;
    private double saldo;

    public CajaDeAhorro(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void extraer(double monto) {
        saldo -= monto;
    }

    public void cerrarCuenta() {
        System.out.println("Cuenta cerrada exitosamente.");
    }
}
