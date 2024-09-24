import java.util.Arrays;

public class SistemaVenta {
    private Cliente [] clientes;
    private int numeroVenta;


    public SistemaVenta() {
        this.clientes = new Cliente[100];
        this.numeroVenta = 0;
    }

    public boolean verificarCliente(int dni){

        /* ACA SE VERIFIACA LA EXISTENCIA DEL CLIENTE Y
        * EN CASO DE NO ENCONTRARLA DEIRECTAMENTE LA CREA ABAJO
        * USANDO EL NUMERO DE VENTAS QUE EL EJERCICIO PIDE QUE SE GENERE*/
        for(int i = 0; i< clientes.length && clientes[i]!= null;i++){

            if(clientes[i].dni == dni){
                numeroVenta ++;
                return true;

            }

        }

        clientes[numeroVenta] = new Cliente(dni);
        numeroVenta++;
        return true;

    }

    public String comprarProducto(int dni,Producto productoComprar, int cantidad){    // SOLO SE PUEDE ELEGIR UN TIPO DE PRODUCTO PERO ENTIENDO QUE EL USUARIO DEBERIA
        if(productoComprar.stock > cantidad && verificarCliente(dni)){                //PODER INGRESAR UNO O MAS TIPOS DE PRODUCTOS.
            productoComprar.stock -= cantidad;
            return "Compra exitosa el total es de: "+productoComprar.precio*cantidad;
        }
        return "No se pudo efectuar la compra.";
    }

    public Cliente[] getClientes() {
        return clientes;
    }

}
