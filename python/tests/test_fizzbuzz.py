import pytest
from fizzbuzz import of


class TestOf:
    def test_returns_number_as_is(self):
        assert of(1) == "1"
        assert of(2) == "2"

    def test_returns_fizz_for_multiples_of_3(self):
        assert of(3) == "Fizz"
        assert of(6) == "Fizz"

    def test_returns_buzz_for_multiples_of_5(self):
        assert of(5) == "Buzz"
        assert of(10) == "Buzz"

    def test_returns_fizzbuzz_for_multiples_of_15(self):
        assert of(15) == "FizzBuzz"
        assert of(30) == "FizzBuzz"
