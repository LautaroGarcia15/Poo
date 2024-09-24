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


    protected String agregarCiclista(Ciclista ciclista){
        if(cantidadEquipo<=equipo.length){
            equipo[cantidadEquipo] = ciclista;
            cantidadEquipo++;
            return "El ciclista se agrego correctamente";
        }else{
            return "El equipo esta lleno.";
        }
    }


    protected Ciclista listarCiclistas(){                             //LISTA LOS CILISTAS Y TODOS SUS DATOS
        for(int i = 0; i<equipo.length && equipo[i] != null;i++){
            return equipo[i];
        }
        return null;
    }


    protected String listarNombresDeCiclistasPorEquipo(){
        for(int i = 0; equipo[i] != null; i++){
            return  equipo[i].getNombreCiclista();
        }
        return null;
    }


    protected String tiempoTotal(){
        int tiempoTotal = 0;
        for(int i = 0; i<equipo.length && equipo[i] != null;i++){
            tiempoTotal =+ equipo[i].getTiempoEnCarrera();
        }
        return "El tiempo total del equipo '"+ nombreEquipo +"' es: "+tiempoTotal;
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
