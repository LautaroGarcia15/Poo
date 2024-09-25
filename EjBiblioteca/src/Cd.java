import java.util.Date;

public class Cd extends ItemPrestamo{

    public Cd(int codigo, String nombre, Date fechaPrestamo, Date fechaDevolucion) {
        super(codigo, nombre, fechaPrestamo, fechaDevolucion);
    }
}
