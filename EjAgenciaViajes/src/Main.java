public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Aereo(123,"Aereo",100,100);
        Producto producto2 = new Excursion(456,"Excursion",100, 200);

        SistemaVenta venta = new SistemaVenta();

        System.out.println("");
        System.out.println(venta.comprarProducto(45896697, producto1,1));
        System.out.println("");
        System.out.println(venta.comprarProducto(45896698,producto2,300));
        System.out.println("");
        System.out.println(venta.comprarProducto(12345678,producto1,5));
        System.out.println("");
        System.out.println(venta.comprarProducto(45897985,producto2,1));



    }


}