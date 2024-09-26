public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {  //Constructor que setea clase Contrarrelojista
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimirDatosCiclista() {
        System.out.println("id: "+getIdentificador()+"| nombre: "+getNombre()+"| tiempo en carrera: "+getTiempoEnCarrera()+"| velocidad maxima: "+ getVelocidadMaxima());

    }

    @Override
    public String imprimirTipo() {           // Sobrescribo (uso del metodo override) el metodo imprimirTipo
        return "Es un Contrarrelojista";
    }

    @Override
    public String toString() {
        return "Contrarrelojista{" +
                "velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
