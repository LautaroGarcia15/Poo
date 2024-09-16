package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombreProvincia;
    private List<Provincia> provinciasLimitrofes;
    private List<Pais> paisesLimitrofesDeProvincias;
    private List<Ciudad> ciudades;
    private String capital;

    public Provincia(String nombreProvincia, String capital) {
        this.nombreProvincia = nombreProvincia;
        this.provinciasLimitrofes = new ArrayList<>();
        this.paisesLimitrofesDeProvincias = new ArrayList<>();
        this.ciudades = new ArrayList<>();
        this.capital = capital;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void agregarPaisAProvincia(Pais pais){
        paisesLimitrofesDeProvincias.add(pais);
    }

    public void agregarProcinciaAProvincia(Provincia provincia){
        provinciasLimitrofes.add(provincia);
    }

    public void agregarCiudadAProvincia(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public String toString(){
        return nombreProvincia;
    }
}
