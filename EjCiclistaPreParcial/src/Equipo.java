public class Equipo {
    private String nombreEquipo;
    private Ciclista[] ciclistasDelEquipo;
    private int cantidadCiclistas;
    private static final int TAMAÑO_EQUIPO = 5;
    private static int tiempoTotal;


    public Equipo() {
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.ciclistasDelEquipo = new Ciclista[TAMAÑO_EQUIPO];
        this.cantidadCiclistas = 0;
        this.tiempoTotal = 0;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCantidadCiclistas() {
        return cantidadCiclistas;
    }

    public void setCantidadCiclistas(int cantidadCiclistas) {
        this.cantidadCiclistas = cantidadCiclistas;
    }

    public int getTamañoDeEquipo() {
        return TAMAÑO_EQUIPO;
    }

    public static int getTiempoTotal() {
        return tiempoTotal;
    }

    public static void setTiempoTotal(int tiempoTotal) {
        Equipo.tiempoTotal = tiempoTotal;
    }

    public Ciclista[] getCiclistasDelEquipo() {
        return ciclistasDelEquipo;
    }

    public void setCiclistasDelEquipo(Ciclista[] ciclistasDelEquipo) {
        this.ciclistasDelEquipo = ciclistasDelEquipo;
    }

    public void imprimirDatosDeEquipos(){
        System.out.println("nombre del equipo: "+getNombreEquipo()+ "| ciclistas del equipo: "+ciclistasDelEquipo+ "| tiempo total: "+ getTiempoTotal());
    }

    /*Metodo para agregar un ciclista a un equipo,
    * en caso de que se pueda agregar devuelve true,
    * en caso de que no se puede agregar devuelve false,
    * tambien se podria  devolver un String que diga que
    * se agrego o no.*/
    public boolean aniadirCiclistas(Ciclista ciclista){
        boolean flag = true;
        for (int i = 0; i<ciclistasDelEquipo.length && ciclistasDelEquipo[i]!=null && flag;i++){

            if(ciclista.getIdentificador() == ciclistasDelEquipo[i].getIdentificador()) {
                flag = false;
            }
        }
        if(flag && cantidadCiclistas < ciclistasDelEquipo.length){
            ciclistasDelEquipo[cantidadCiclistas] = ciclista;
            cantidadCiclistas++;
        }
        return flag;
    }

    public int calcularTiempoTotal(){
        for (int i = 0; i <= ciclistasDelEquipo.length && ciclistasDelEquipo[i]!=null; i++){
            tiempoTotal += ciclistasDelEquipo[i].getTiempoEnCarrera();
        }
        return tiempoTotal;
    }

    public String listarNombreCiclistas(){
        String nombreCiclistas = "";
        for(int i = 0; i<=ciclistasDelEquipo.length && ciclistasDelEquipo[i]!=null;i++){
            nombreCiclistas+= ciclistasDelEquipo[i].getNombre()+"\n";
        }
        return nombreCiclistas;
    }
    public void buscarCiclista(int identificadorCiclista) {
        for (int i = 0; i < ciclistasDelEquipo.length && ciclistasDelEquipo[i] != null ; i++) {

            if (identificadorCiclista == ciclistasDelEquipo[i].getIdentificador()) {
                ciclistasDelEquipo[i].imprimirDatosCiclista();
            }
        }
    }
}
