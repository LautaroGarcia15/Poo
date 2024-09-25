public class Cliente {
    public int dni;
    private String nombre;
    private String domicilio;
    public boolean prestamosPendientes;

    public Cliente(int dni, String nombre, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.prestamosPendientes = false;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isPrestamosPendientes() {
        return prestamosPendientes;
    }

    public void setPrestamosPendientes(boolean prestamosPendientes) {
        this.prestamosPendientes = prestamosPendientes;
    }
}
