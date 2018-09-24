package ru.job4j.findloop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenLoopHasLength5Then() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenLoopHasLength28Then() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 28};
        int value = 28;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenLoopHasLength10Then() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
}