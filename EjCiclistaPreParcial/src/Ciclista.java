public abstract class Ciclista {        //hago que la clase ciclista(padre),sea abstracta.
    private int identificador;      //uso el private, para el ocultamiento de los datos.
    private String nombre;
    private int tiempoEnCarrera;

    public Ciclista() {  //estoy aplicando polimosrfismo dado que uso dos firmas distintas
                        //la vacia y la que setea los valores.
    }

    public Ciclista(int identificador, String nombre) {   //Constructor que setea clase Ciclista
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoEnCarrera = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEnCarrera() {
        return tiempoEnCarrera;
    }

    public void setTiempoEnCarrera(int tiempoEnCarrera) {
        this.tiempoEnCarrera = tiempoEnCarrera;
    }

    protected abstract void  imprimirDatosCiclista();
    protected abstract String imprimirTipo();

    @Override
    public String toString() {
        return "Ciclista{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", tiempoEnCarrera=" + tiempoEnCarrera +
                '}';
    }
}
