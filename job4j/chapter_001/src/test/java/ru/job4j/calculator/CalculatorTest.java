package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAdd1OnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add1(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAdd2OneSubtractleOneThenZero() {
        Calculator calc = new Calculator();
        calc.add2(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    @Test
        public void whenAdd3OneMultipleOneThenOne() {
        Calculator calc = new Calculator();
        calc.add3(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAdd4OneDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.add4(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}