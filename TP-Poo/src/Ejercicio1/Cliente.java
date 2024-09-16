package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private List<CajaDeAhorro> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<CajaDeAhorro> getCuentas() {
        return cuentas;
    }

    public void agregarCuenta(CajaDeAhorro cuenta) {
        cuentas.add(cuenta);
    }

    public void listarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("El cliente no tiene cuentas.");
        } else {
            for (CajaDeAhorro cuenta : cuentas) {
                System.out.println("Cuenta N°: " + cuenta.getNumeroCuenta() + " - Saldo: " + cuenta.getSaldo());
            }
        }
    }
}



