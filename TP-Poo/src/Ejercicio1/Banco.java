package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

class Banco {
    private String nombre;
    private List<Cliente> clientes;
    private int siguienteNumeroCuenta;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.siguienteNumeroCuenta = 1;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public CajaDeAhorro crearCajaDeAhorro(Cliente cliente) {
        CajaDeAhorro nuevaCuenta = new CajaDeAhorro(siguienteNumeroCuenta++);
        cliente.agregarCuenta(nuevaCuenta);
        return nuevaCuenta;
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }
}
