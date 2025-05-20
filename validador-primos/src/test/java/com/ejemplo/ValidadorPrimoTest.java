package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest {

    @Test
    public void testUnoNoEsPrimo() {
        // 🚨 Falla porque ValidadorPrimo aún no existe
        assertFalse(ValidadorPrimo.esPrimo(1));
    }
}