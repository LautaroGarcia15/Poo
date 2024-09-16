public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    public Contrarrelojista(int identifiadorCiclista, String nombreCiclista, double veloidadMaxima) {
        super(identifiadorCiclista, nombreCiclista);
        this.velocidadMaxima = veloidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void ImprimirTipo(){
        System.out.println("El ciclista es de tipo Contrarreloj.");
    }

    @Override
    public String toString() {
        return super.toString() + ", de tipo Contrarrelojista { " +
                " velocidadMaxima= " + velocidadMaxima +
                '}';
    }
}
