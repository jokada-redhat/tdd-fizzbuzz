package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Nested
    class of {
        @Test
        void returnsNumberAsIs() {
            assertEquals("1", FizzBuzz.of(1));
            assertEquals("2", FizzBuzz.of(2));
        }

        @Test
        void returnsFizzForMultiplesOf3() {
            assertEquals("Fizz", FizzBuzz.of(3));
            assertEquals("Fizz", FizzBuzz.of(6));
        }

        @Test
        void returnsBuzzForMultiplesOf5() {
            assertEquals("Buzz", FizzBuzz.of(5));
            assertEquals("Buzz", FizzBuzz.of(10));
        }

        @Test
        void returnsFizzBuzzForMultiplesOf15() {
            assertEquals("FizzBuzz", FizzBuzz.of(15));
            assertEquals("FizzBuzz", FizzBuzz.of(30));
        }
    }

}
