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
    }

}
