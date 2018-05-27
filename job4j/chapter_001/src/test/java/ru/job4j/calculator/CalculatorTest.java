package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenaAdditionOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addition(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractionOneSubtractleOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtraction(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }

    @Test
        public void whenMultiplicationOneMultipleOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiplication(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivisionOneDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.division(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}