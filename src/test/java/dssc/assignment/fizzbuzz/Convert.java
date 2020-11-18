package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    @ParameterizedTest
    @CsvSource({"1,1","2,2","41,41"})
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(expected, fizzbuzz.convert(number));
    }

    @Test
    void number_3_to_Fizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz",fizzbuzz.convert(3));
    }

    @Test
    void number_6_to_Fizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz",fizzbuzz.convert(6));
    }

    @Test
    void number_24_to_Fizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz",fizzbuzz.convert(24));
    }
}
