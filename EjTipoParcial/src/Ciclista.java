public abstract class Ciclista {
    private int identifiadorCiclista;
    private String nombreCiclista;
    private int tiempoEnCarrera;

    public Ciclista(int identifiadorCiclista, String nombreCiclista) {
        this.identifiadorCiclista = identifiadorCiclista;
        this.nombreCiclista = nombreCiclista;
        this.tiempoEnCarrera = 0;
    }

    public int getIdentifiadorCiclista() {
        return identifiadorCiclista;
    }

    public void setIdentifiadorCiclista(int identifiadorCiclista) {
        this.identifiadorCiclista = identifiadorCiclista;
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public int getTiempoEnCarrera() {
        return tiempoEnCarrera;
    }

    public void setTiempoEnCarrera(int tiempoEnCarrera) {
        this.tiempoEnCarrera = tiempoEnCarrera;
    }

    @Override
    public String toString() {
        return "Ciclista {" +
                " identifiadorCiclista= " + identifiadorCiclista +
                ", nombreCiclista= '" + nombreCiclista + '\'' +
                ", tiempoEnCarrera= " + tiempoEnCarrera +
                '}';
    }



    public abstract void ImprimirTipo();


}
