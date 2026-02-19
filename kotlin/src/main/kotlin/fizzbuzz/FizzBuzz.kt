package fizzbuzz

object FizzBuzz {

    private const val FIZZ_DIVISOR = 3
    private const val BUZZ_DIVISOR = 5
    private const val FIZZ = "Fizz"
    private const val BUZZ = "Buzz"

    fun of(n: Int): String {
        val result = buildString {
            if (n % FIZZ_DIVISOR == 0) append(FIZZ)
            if (n % BUZZ_DIVISOR == 0) append(BUZZ)
            if (isEmpty()) append(n)
        }
        return result
    }
}
