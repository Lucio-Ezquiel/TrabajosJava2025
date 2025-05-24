package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaBanco {

    Banco banco;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        banco.agregarCuenta("123", 1000.0);
    }

    @Test
    @DisplayName("Debe agregar una cuenta con saldo inicial")
    void testAgregarCuenta() {
        banco.agregarCuenta("456", 500.0);
        assertEquals(500.0, banco.consultarSaldo("456"));
    }

    @Test
    @DisplayName("Debe consultar el saldo de una cuenta existente")
    void testConsultarSaldoExistente() {
        assertEquals(1000.0, banco.consultarSaldo("123"));
    }

    @Test
    @DisplayName("Debe lanzar excepción al consultar saldo de cuenta inexistente")
    void testConsultarSaldoInexistente() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.consultarSaldo("999");
        });
        assertEquals("La cuenta no existe", ex.getMessage());
    }

    @Test
    @DisplayName("Debe depositar correctamente en una cuenta existente")
    void testDepositar() {
        banco.depositar("123", 500.0);
        assertEquals(1500.0, banco.consultarSaldo("123"));
    }

    @Test
    @DisplayName("Debe lanzar excepción al depositar monto negativo")
    void testDepositarMontoNegativo() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("123", -100.0);
        });
        assertEquals("El monto no puede ser negativo", ex.getMessage());
    }

    @Test
    @DisplayName("Debe lanzar excepción al depositar en cuenta inexistente")
    void testDepositarCuentaInexistente() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("999", 100.0);
        });
        assertEquals("La cuenta no existe", ex.getMessage());
    }

    @Test
    @DisplayName("Debe retirar correctamente de una cuenta existente")
    void testRetirar() {
        banco.retirar("123", 300.0);
        assertEquals(700.0, banco.consultarSaldo("123"));
    }

    @Test
    @DisplayName("Debe lanzar excepción al retirar monto negativo")
    void testRetirarMontoNegativo() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("123", -50.0);
        });
        assertEquals("El monto no puede ser negativo", ex.getMessage());
    }

    @Test
    @DisplayName("Debe lanzar excepción al retirar más del saldo disponible")
    void testRetirarSaldoInsuficiente() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("123", 2000.0);
        });
        assertEquals("Saldo insuficiente", ex.getMessage());
    }

    @Test
    @DisplayName("Debe lanzar excepción al retirar de cuenta inexistente")
    void testRetirarCuentaInexistente() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("999", 100.0);
        });
        assertEquals("La cuenta no existe", ex.getMessage());
    }
}

