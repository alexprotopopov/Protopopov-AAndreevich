package ru.job4j;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alex Protopopov (alexprov@bk.ru)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Alex Protopopov";
    String expect = "Echo, echo, echo : Alex Protopopov";
	ru.job4j.Calculate calc = new ru.job4j.Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}
