package ru.job4j.counter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {

       Counter add = new Counter();
       int result = Counter.add (1, 10);
        assertThat(result, is(30));


    }
}