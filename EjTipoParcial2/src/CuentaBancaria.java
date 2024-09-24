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
        this.estadoCuenta = false; // si la cuenta esta activa devuelve true, de lo contrario devuelve false
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

    public void chequearEstadoDeCuenta() { //permite chequear el estado de la cuenta despues de cada operacion
        if(saldo>0){
            estadoCuenta = true;
        }else {
            estadoCuenta = false;
        }
    }

    public void cargarSaldo(double ingreso) { //operacion que permite cargar saldo
        this.saldo += ingreso;
        chequearEstadoDeCuenta();
    }

    public abstract String imprimirDatos(); // funcion para imprimir los datos

    public String consultarSaldo(){
        return  "El saldo de la cuenta: "+numeroCuentaBancaria+" es: "+saldo; //return  String
    }

    public boolean retirarSaldo(double retiro){ // funcion que permite retirar dinero
        if (estadoCuenta) {                     // devuelve true si la operacion se realizo correctamente
            if (saldo >= retiro) {
                saldo -= retiro;
                chequearEstadoDeCuenta();
                return true;
            }
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
        if (estadoCuenta) {
            if (monto <= this.saldo) {
                destino.saldo += monto;
                this.saldo -= monto;
                chequearEstadoDeCuenta();
                return true;
            }
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
