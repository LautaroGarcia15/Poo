public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {  //Constructor que setea clase Velocista
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public  void  imprimirDatosCiclista(){
        System.out.println("id: "+getIdentificador()+"| nombre: "+getNombre()+"| tiempo en carrera: "+getTiempoEnCarrera()+"| potencia promedio: "+getPotenciaPromedio()+"| velocidad promedio: "+getVelocidadPromedio());
    }

    @Override
    public String imprimirTipo() {        // Aplico el metodo override para sobrescribir el metodo imprimirTipo de la clase Ciclista
        return "Es un Velocista";
    }

    @Override
    public String toString() {
        return "Velocista{" +
                "potenciaPromedio=" + potenciaPromedio +
                ", velocidadPromedio=" + velocidadPromedio +
                '}';
    }
}
