import java.sql.SQLOutput;

public class Juego {

    private int cantidadVidas;

    private int vidasIniciales;

    public Juego(int vidas) {
        this.cantidadVidas = vidas;
        this.vidasIniciales = vidas;
    }

    public int mostrarVidas(){
        return this.cantidadVidas;
    }

    public void restarVidas(){
        cantidadVidas--;
    }

    public void reiniciarPartida(){
        cantidadVidas = vidasIniciales;
    }

    public boolean quitarVida() {
        cantidadVidas--;
        return cantidadVidas == 0;
    }

}
