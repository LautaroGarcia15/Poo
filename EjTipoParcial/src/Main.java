public class Main {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Velocista(1, "Raul", 12.2, 32.6);
        Ciclista ciclista2 = new Contrarrelojista(2, "Pedro", 20.0);
        Ciclista ciclista3 = new Escalador(3, "Pablo", 10, 45);
        Equipo equipo1 = new Equipo("Olmo", 5);
        Equipo equipo2 = new Equipo("Rayo", 5);

        ciclista1.ImprimirTipo();
        ciclista2.ImprimirTipo();
        ciclista3.ImprimirTipo();

        ciclista1.setTiempoEnCarrera(128);
        ciclista2.setTiempoEnCarrera(456);
        ciclista3.setTiempoEnCarrera(789);

        equipo1.agregarCiclista(ciclista1);
        equipo1.agregarCiclista(ciclista2);
        equipo2.agregarCiclista(ciclista3);

        System.out.println("");

        //equipo1.listarCiclistas();
        //equipo2.listarCiclistas();

        equipo1.listarNombresDeCiclistasPorEquipo();

        System.out.println("");

        equipo2.listarNombresDeCiclistasPorEquipo();

        System.out.println("");

        equipo1.tiempoTotal();
        equipo2.tiempoTotal();

        System.out.println("");

        System.out.println(equipo1.listarDatosCiclista(1));
        System.out.println(equipo1.listarDatosCiclista(2));
        System.out.println(equipo1.listarDatosCiclista(3));

        System.out.println("");
        System.out.println("FIN DEL PROGRAMA.");
    }
}