package fizzbuzz;

public class FizzBuzz {

    public static String of(int n) {
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(of(i));
        }
    }

}
