package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

// SI NO TENGO UNA CIUDAD CREADA NO PUEDO CREAR NINGUN VUELO
// ¿QUE ES MEJOR?
// DEJARLO ASI O PONER ASIGNAR DESTINO, ORIGEN, ESCALA
// PREGUNTAR LO DE EL toString
public class Vuelo {
    public int numeroVuelo;
    private Ciudad origen;
    private Ciudad destino;
    private Ciudad [] escala;
    private Avion numeroAvion;
    int numeroDeEscalas;

    public Vuelo(int numeroVuelo, Ciudad origen, Ciudad destino, Avion numeroAvion, int cantidadEscalas) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.escala = new Ciudad[cantidadEscalas];
        this.numeroAvion = numeroAvion;
        this.numeroDeEscalas = 0;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Avion getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(Avion numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public void agregarEscala(Ciudad ciudad){
        if(numeroDeEscalas <= escala.length){
            escala[numeroDeEscalas] = ciudad;
            numeroDeEscalas++;
        }
    }
}
