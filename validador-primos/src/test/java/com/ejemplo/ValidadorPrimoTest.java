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

    @Test
    public void testCuatroEsPrimo() {
        assertFalse(ValidadorPrimo.esPrimo(4));
    }

    @Test
    public void testCincoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(5));
    }
}