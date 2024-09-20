public abstract class CuentaBancaria {
    private String titular;
    private String apellidoTitular;
    private  int numeroCuentaBancaria;
    private double saldo;
    private double porcentadeInteres;
    private boolean estadoCuenta;

    public CuentaBancaria(String titular, String apellidoTitular, int numeroCuentaBancaria) {
        this.titular = titular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.saldo = 0.0;
        this.porcentadeInteres = 0.37;
        this.estadoCuenta = false;
    }

    public CuentaBancaria() { //Polimorfismo
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public int getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(int numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        if(saldo>0){
            estadoCuenta = true;
        }
    }

    public void cargarSaldo(double ingreso) {
        this.saldo += ingreso;
    }

    public abstract String imprimirDatos();

    public String consultarSaldo(){
        return  "El saldo de la cuenta: "+numeroCuentaBancaria+" es: "+saldo; //return un STIRing
    }

    public boolean retirarSaldo(double retiro){
        if(saldo >= retiro){
            saldo -= retiro;
            return true;
        }
        return false;
    }

    public void tasaDeIteres(){
        double porcentajeTotal = saldo*porcentadeInteres;
        saldo += porcentajeTotal;
    }
    public boolean compararSaldo (CuentaBancaria cuentaComparar){
        return cuentaComparar.getSaldo() <= this.getSaldo();
    }

    public boolean transferirSaldo(CuentaBancaria destino, double monto){
        if(monto <= this.saldo){
            destino.saldo += monto;
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    @Override                    //USO EL OVERRIDE
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", apellidoTitular='" + apellidoTitular + '\'' +
                ", numeroCuentaBancaria=" + numeroCuentaBancaria +
                ", saldo=" + saldo +
                ", porcentadeInteres=" + porcentadeInteres +
                '}';
    }

}
