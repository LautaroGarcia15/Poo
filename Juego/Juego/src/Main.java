public class Main {
    public static void main(String[] args) {
        Juego player1 = new Juego(2);

        System.out.println("La cantidad de vidas restantes del jugador 1 es: "+player1.mostrarVidas());

        player1.restarVidas();

        System.out.println("La cantidad de vidas restantes del jugador 1 es: "+player1.mostrarVidas());

        Juego player2 = new Juego(5);

        System.out.println("La cantidad de vidas restantes del jugador 2 es: "+player2.mostrarVidas());
        System.out.println("La cantidad de vidas restantes del jugador 1 es: "+player1.mostrarVidas());

        System.out.println(player1.quitarVida());
        System.out.println("La cantidad de vidas restantes del jugador 1 es: "+player1.mostrarVidas());

        player1.reiniciarPartida();
        System.out.println("La cantidad de vidas restantes del jugador 1 es: "+player1.mostrarVidas());

    }
}