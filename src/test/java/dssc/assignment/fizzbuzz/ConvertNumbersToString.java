package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertNumbersToString {

    @Test
    void number_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void number_2() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    void number_41() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("41", fizzbuzz.convert(41));
    }
}
