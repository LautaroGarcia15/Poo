public class CuentaDeAhorros extends CuentaBancaria{

    public CuentaDeAhorros(String titular, String apellidoTitular, int numeroCuentaBancaria) {
        super(titular, apellidoTitular, numeroCuentaBancaria);
    }

    public CuentaDeAhorros() {
    }

    @Override
    public String imprimirDatos() {
        return "Nombre del titular: "+getTitular()+", apellido: "+getApellidoTitular()+", numero de cuenta: "+getNumeroCuentaBancaria()+", saldo: "+getSaldo()+ ".\nEsta cuenta es de tipo cuenta corriente";
    }
}
