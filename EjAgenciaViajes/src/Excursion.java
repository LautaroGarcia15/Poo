public class Excursion extends Producto{


    public Excursion(int codigo, String descripcion, double precio, int stock) {
        super(codigo, descripcion, precio * 1.01, stock);
    }
}
