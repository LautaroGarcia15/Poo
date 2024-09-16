public class Equipo {
    String nombreEquipo;
    Ciclista[] equipo;
    float puntaje;
    int cantidadEquipo;

    public Equipo(String nombreEquipo, int tamanioDeEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.equipo = new Ciclista[tamanioDeEquipo];
        this.puntaje = 0;
        this.cantidadEquipo = 0;
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected void agregarCiclista(Ciclista ciclista){
        if(cantidadEquipo<=equipo.length){
            equipo[cantidadEquipo] = ciclista;
            cantidadEquipo++;
        }else{
            System.out.println("El equipo esta lleno.");
        }
    }

    protected void listarCiclistas(){                                       //LISTA LOS CILISTAS Y TODOS SUS DATOS
        System.out.println("EQUIPO: "+ nombreEquipo);
        for(int i = 0; i<equipo.length && equipo[i] != null;i++){
            System.out.println(equipo[i]);
        }
    }

    protected void listarNombresDeCiclistasPorEquipo(){
        System.out.println("LOS CILISTAS DEL EQUIPO "+nombreEquipo+" SON: ");
        for(int i = 0; i<= equipo.length && equipo[i]!=null;i++){
            System.out.println(equipo[i].getNombreCiclista());
        }
    }

    protected void tiempoTotal(){
        int tiempoTotal = 0;
        for(int i = 0; i<equipo.length && equipo[i] != null;i++){
            tiempoTotal =+ equipo[i].getTiempoEnCarrera();
        }
        System.out.println("El tiempo total del equipo '"+ nombreEquipo +"' es: "+tiempoTotal);;
    }

    protected String listarDatosCiclista(int identificador){
        for(int i = 0; i<= equipo.length && equipo[i] != null; i++){
            if(equipo[i].getIdentifiadorCiclista() == identificador){
                return  equipo[i].toString();
            }
        }
        return "No exite este ciclsita en este equipo.";

    }

}
