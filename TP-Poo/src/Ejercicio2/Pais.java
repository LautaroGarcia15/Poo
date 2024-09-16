package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    public String nombrePais;
    private List<Provincia> provinciaDelPais;
    private Provincia capital;
    private List<Pais> paisesLimitrofesDePais;
    private String continente;



    public Pais(String nombrePais, String continente) {
        this.nombrePais = nombrePais;
        this.provinciaDelPais = new ArrayList<>();
        this.paisesLimitrofesDePais = new ArrayList<>();
        this.continente = continente;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void asignarCapital(Provincia capital){
        this.capital = capital;
    }

    public Provincia mostrarCapital(){
        return capital;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void agreagarProvinciaAPais(Provincia provincia){
        provinciaDelPais.add(provincia);
    }

    public void agregarPaisLimitrofe(Pais paisLimitrofe){
        paisesLimitrofesDePais.add(paisLimitrofe);
    }
}


