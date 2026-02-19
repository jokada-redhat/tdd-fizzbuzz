package fizzbuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Nested
    inner class Of {
        @Test
        fun returnsNumberAsIs() {
            assertEquals("1", FizzBuzz.of(1))
            assertEquals("2", FizzBuzz.of(2))
        }

        @Test
        fun returnsFizzForMultiplesOf3() {
            assertEquals("Fizz", FizzBuzz.of(3))
            assertEquals("Fizz", FizzBuzz.of(6))
        }

        @Test
        fun returnsBuzzForMultiplesOf5() {
            assertEquals("Buzz", FizzBuzz.of(5))
            assertEquals("Buzz", FizzBuzz.of(10))
        }

        @Test
        fun returnsFizzBuzzForMultiplesOf15() {
            assertEquals("FizzBuzz", FizzBuzz.of(15))
            assertEquals("FizzBuzz", FizzBuzz.of(30))
        }
    }
}
