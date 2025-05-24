package org.example;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private Map<String, Double> cuentas = new HashMap<>();

    public void agregarCuenta(String numeroCuenta, double saldoInicial) {
        cuentas.put(numeroCuenta, saldoInicial);
    }

    public double consultarSaldo(String numeroCuenta) {
        validarCuentaExiste(numeroCuenta);
        return cuentas.get(numeroCuenta);
    }

    public void depositar(String numeroCuenta, double monto) {
        validarCuentaExiste(numeroCuenta);
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        cuentas.put(numeroCuenta, cuentas.get(numeroCuenta) + monto);
    }

    public void retirar(String numeroCuenta, double monto) {
        validarCuentaExiste(numeroCuenta);
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        double saldoActual = cuentas.get(numeroCuenta);
        if (saldoActual < monto) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        cuentas.put(numeroCuenta, saldoActual - monto);
    }

    private void validarCuentaExiste(String numeroCuenta) {
        if (!cuentas.containsKey(numeroCuenta)) {
            throw new IllegalArgumentException("La cuenta no existe");
        }
    }
}

