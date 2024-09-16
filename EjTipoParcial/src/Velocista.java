public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioSprint;
    public Velocista(int identifiadorCiclista, String nombreCiclista, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identifiadorCiclista, nombreCiclista);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }


    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public void ImprimirTipo(){
        System.out.println("El ciclista es de tipo Velocista.");
    }

    @Override
    public String toString() {
        return super.toString() + ", de tipo Velocista { " +
                " potenciaPromedio= " + potenciaPromedio +
                ", velocidadPromedioSprint= " + velocidadPromedioSprint +
                '}';
    }
}
