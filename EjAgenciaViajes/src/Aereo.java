public class Aereo extends Producto{


    public Aereo(int codigo, String descripcion, double precio, int stock) {
        super(codigo, descripcion, precio + 20, stock);
    }
}
