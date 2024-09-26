public class Escalador extends Ciclista{
    private float aceleracionPromedioSubida;
    private float gradoDeRampa;

    public Escalador(int identificador, String nombre, float aceleracionPromedioSubida, float gradoDeRampa) {  //Constructor que setea clase Escalador
        super(identificador, nombre);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoDeRampa = gradoDeRampa;
    }

    public float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    public void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    public float getGradoDeRampa() {
        return gradoDeRampa;
    }

    public void setGradoDeRampa(float gradoDeRampa) {
        this.gradoDeRampa = gradoDeRampa;
    }

    @Override
    public void imprimirDatosCiclista() {
        System.out.println("id: "+getIdentificador()+"| nombre: "+getNombre()+"| tiempo en carrera: "+getTiempoEnCarrera()+"| aceleracion promedio en subida: "+getAceleracionPromedioSubida()+"| grado de rampa: "+getGradoDeRampa());

    }

    @Override
    public String imprimirTipo() {      // Sobrescribo (uso del metodo override) el metodo imprimirTipo
        return "Es un Escalador";
    }

    @Override
    public String toString() {
        return "Escalador{" +
                "aceleracionPromedioSubida=" + aceleracionPromedioSubida +
                ", gradoDeRampa=" + gradoDeRampa +
                '}';
    }
}
