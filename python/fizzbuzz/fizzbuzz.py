FIZZ_DIVISOR = 3
BUZZ_DIVISOR = 5
FIZZ = "Fizz"
BUZZ = "Buzz"


def of(n: int) -> str:
    result = ""
    if n % FIZZ_DIVISOR == 0:
        result += FIZZ
    if n % BUZZ_DIVISOR == 0:
        result += BUZZ
    if not result:
        result = str(n)
    return result
