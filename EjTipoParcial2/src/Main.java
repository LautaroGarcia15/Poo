public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaDeAhorros("Lautaro","Garcia",1);
        CuentaBancaria cuenta2 = new CuentaCorriente("Matias", "Romero", 2);

        cuenta1.cargarSaldo(100000);
        cuenta2.cargarSaldo(200000);

        System.out.println(cuenta1.imprimirDatos());

        System.out.println("");

        System.out.println(cuenta2.imprimirDatos());

        System.out.println("");

        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());

        System.out.println("");

        System.out.println("RETIROS: ");
        System.out.println(cuenta1.retirarSaldo(50000)); //devuelve true si se pudo retirar dinero, de lo contrario devuelve false
        System.out.println(cuenta2.retirarSaldo(300000));

        System.out.println("");

        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());

        cuenta1.tasaDeIteres();
        cuenta2.tasaDeIteres();

        System.out.println("");

        System.out.println("DESPUES DE LA TADA DE INTERESES: ");
        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());

        System.out.println("");

        System.out.println("COMPARACION DE SALDOS: ");
        System.out.println(cuenta1.compararSaldo(cuenta2));
        System.out.println(cuenta2.compararSaldo(cuenta1));

        System.out.println("");

        System.out.println("TRANSFERENCIAS: ");
        System.out.println(cuenta1.transferirSaldo(cuenta2, 50000)); //devuelve true si se pudo realizar la transferencia o false si no se pudo
        System.out.println(cuenta1.transferirSaldo(cuenta2, 50000));

        System.out.println("");

        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());

    }


}