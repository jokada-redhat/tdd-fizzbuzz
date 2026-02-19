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
    }
}
