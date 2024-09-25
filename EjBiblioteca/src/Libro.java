import java.util.Date;

public class Libro extends ItemPrestamo{

    public Libro(int codigo, String nombre, Date fechaPrestamo, Date fechaDevolucion) {
        super(codigo, nombre, fechaPrestamo, fechaDevolucion);
    }
}
