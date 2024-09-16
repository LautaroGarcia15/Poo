package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco!");

        Cliente cliente1 = new Cliente("Juan Pérez");

        banco.agregarCliente(cliente1);

        CajaDeAhorro cuenta1 = banco.crearCajaDeAhorro(cliente1);

        cuenta1.depositar(500);
        cliente1.listarCuentas();

        cuenta1.extraer(200);
        cliente1.listarCuentas();
    }
}