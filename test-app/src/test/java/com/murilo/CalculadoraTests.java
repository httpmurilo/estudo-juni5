package com.murilo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        var calculo = calculadora.soma(1,5);
        Assertions.assertEquals(6,calculo);
    }
}
