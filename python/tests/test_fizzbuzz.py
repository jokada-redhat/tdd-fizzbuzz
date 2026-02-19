import pytest
from fizzbuzz import of


class TestOf:
    def test_returns_number_as_is(self):
        assert of(1) == "1"
        assert of(2) == "2"
