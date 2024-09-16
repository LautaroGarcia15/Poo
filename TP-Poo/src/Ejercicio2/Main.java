package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Argentina","Sudamerica");
        Provincia provincia1 = new Provincia("Buenos Aires", "Ciudad Autonoma De Buenos Aires");
        Ciudad ciudad1 = new Ciudad("Vicente López");

        //AGREGO UNA PROVINCIA AL PAIS
        pais1.agreagarProvinciaAPais(provincia1);

        //LA ASIGNO COMO CAPITAL DEL PAIS
        pais1.asignarCapital(provincia1);

        //MUESTRO LA CAPITAL DEL PAIS
        System.out.println("La capital de "+pais1.getNombrePais()+" es "+pais1.mostrarCapital());


    }
}
