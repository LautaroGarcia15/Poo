package Ejercicio3;

public class Avion {
    public int numeroAvion;
    private String piloto1;
    private String piloto2;
    private String operadorDeComunicaciones;
    private String comisario1;
    private String comisario2;
    private String azafata1;
    private String azafata2;
    private String azafata3;
    private String azafata4;
    private int capacidad;
    private int asientosOcupados;

    public Avion(int numeroAvion, String piloto1, String piloto2, String operadorDeComunicaciones, String comisario1, String comisario2, String azafata1, String azafata2, String azafata3, String azafata4, int capacidad) {
        this.numeroAvion = numeroAvion;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.operadorDeComunicaciones = operadorDeComunicaciones;
        this.comisario1 = comisario1;
        this.comisario2 = comisario2;
        this.azafata1 = azafata1;
        this.azafata2 = azafata2;
        this.azafata3 = azafata3;
        this.azafata4 = azafata4;
        this.capacidad = capacidad;
        this.asientosOcupados = 0;
    }

    public int getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public String getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(String piloto1) {
        this.piloto1 = piloto1;
    }

    public String getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(String piloto2) {
        this.piloto2 = piloto2;
    }

    public String getOperadorDeComunicaciones() {
        return operadorDeComunicaciones;
    }

    public void setOperadorDeComunicaciones(String operadorDeComunicaciones) {
        this.operadorDeComunicaciones = operadorDeComunicaciones;
    }

    public String getComisario1() {
        return comisario1;
    }

    public void setComisario1(String comisario1) {
        this.comisario1 = comisario1;
    }

    public String getComisario2() {
        return comisario2;
    }

    public void setComisario2(String comisario2) {
        this.comisario2 = comisario2;
    }

    public String getAzafata1() {
        return azafata1;
    }

    public void setAzafata1(String azafata1) {
        this.azafata1 = azafata1;
    }

    public String getAzafata2() {
        return azafata2;
    }

    public void setAzafata2(String azafata2) {
        this.azafata2 = azafata2;
    }

    public String getAzafata3() {
        return azafata3;
    }

    public void setAzafata3(String azafata3) {
        this.azafata3 = azafata3;
    }

    public String getAzafata4() {
        return azafata4;
    }

    public void setAzafata4(String azafata4) {
        this.azafata4 = azafata4;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarPasajero(){
        if(capacidad>= asientosOcupados ){
            asientosOcupados++;
        }else {
            System.out.println("Este avion tiene todos sus asientos ocupados.");
        }
    }

}
