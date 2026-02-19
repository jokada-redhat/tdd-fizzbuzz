package fizzbuzz;

public class FizzBuzz {

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String of(int n) {
        StringBuilder result = new StringBuilder();
        if (n % FIZZ_DIVISOR == 0) result.append(FIZZ);
        if (n % BUZZ_DIVISOR == 0) result.append(BUZZ);
        if (result.length() == 0) result.append(n);
        return result.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(of(i));
        }
    }
}
