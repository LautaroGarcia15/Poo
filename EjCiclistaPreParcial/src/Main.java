public class Main {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Velocista(1, "Raul", 12.2, 32.6);
        Ciclista ciclista2 = new Contrarrelojista(2, "Pedro", 20.0);
        Ciclista ciclista3 = new Escalador(3, "Pablo", 10, 45);
        Equipo equipo1 = new Equipo("Olmo",5);

        System.out.println(ciclista1.imprimirTipo());
        System.out.println(ciclista2.imprimirTipo());
        System.out.println(ciclista3.imprimirTipo());

        ciclista1.setTiempoEnCarrera(15);
        ciclista2.setTiempoEnCarrera(20);
        ciclista3.setTiempoEnCarrera(25);

        ciclista1.imprimirDatosCiclista();
        ciclista2.imprimirDatosCiclista();
        ciclista3.imprimirDatosCiclista();

        equipo1.imprimirDatosDeEquipos();


        System.out.println("IMPRIMIR NOMBRES: ");
        equipo1.aniadirCiclistas(ciclista1);
        equipo1.aniadirCiclistas(ciclista2);
        System.out.println(equipo1.listarNombreCiclistas());

        equipo1.buscarCiclista(2);
    }
}