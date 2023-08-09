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

    @Test
    public void deveRetornarZeroComNumeradorZeroNaDivisao() {
        Calculadora calculadora = new Calculadora();
        var calculo = calculadora.divisao(0,5);
        Assertions.assertEquals(0,calculo);
    }

    @Test
    public void deveRetornarErroDenominadorZeroNaDivisao() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora calculadora = new Calculadora();
            calculadora.divisao(5,0);

        });
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        var calculo = calculadora.subtracao(20,5);
        Assertions.assertEquals(15,calculo);
    }
}
