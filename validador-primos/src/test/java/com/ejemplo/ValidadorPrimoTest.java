package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest {

    @Test
    public void testUnoNoEsPrimo() {
        assertFalse(ValidadorPrimo.esPrimo(1));
    }

    @Test
    public void testDosEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(2));
    }

    @Test
    public void testTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(3));
    }
}