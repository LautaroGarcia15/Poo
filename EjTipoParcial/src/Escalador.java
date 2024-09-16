public class Escalador extends Ciclista{
    private float aceleracionPromedioSubida;
    private float gradoDeRampaSoportada;
    public Escalador(int identifiadorCiclista, String nombreCiclista, float aceleracionPromedioSubida, float gradoDeRampaSoportada) {
        super(identifiadorCiclista, nombreCiclista);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    public float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    public void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    public float getGradoDeRampaSoportada() {
        return gradoDeRampaSoportada;
    }

    public void setGradoDeRampaSoportada(float gradoDeRampaSoportada) {
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    @Override
    public void ImprimirTipo(){
        System.out.println("El ciclista es de tipo Escalador");
    }

    @Override
    public String toString() {
        return super.toString() + ", de tipo Escalador { " +
                " aceleracionPromedioSubida= " + aceleracionPromedioSubida +
                ", gradoDeRampaSoportada= " + gradoDeRampaSoportada +
                '}';
    }
}
