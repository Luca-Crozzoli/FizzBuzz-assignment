package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    @ParameterizedTest
    @CsvSource({"1,1","2,2","41,41"})
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(expected, fizzbuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource( ints ={3,6,24})
    void multiples_of_3_to_Fizz(int number) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz",fizzbuzz.convert(number));
    }

    @Test
    void number_5_to_Buzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz",fizzbuzz.convert(5));
    }

    @Test
    void number_10_to_Buzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz",fizzbuzz.convert(10));
    }

    @Test
    void number_100_to_Buzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz",fizzbuzz.convert(100));
    }

}
