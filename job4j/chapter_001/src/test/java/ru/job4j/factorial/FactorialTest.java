package ru.job4j.factorial;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calc = new Factorial();
              int result = Factorial.calc (5);
        assertThat(result, is(120));
		    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
         Factorial calc = new Factorial();
              int result = Factorial.calc (0);
        assertThat(result, is(1));
		    }
}