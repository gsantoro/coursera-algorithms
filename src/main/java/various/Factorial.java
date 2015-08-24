package various;

/**
 * Created by gsantoro on 19/05/15.
 */
public class Factorial {
    public long factorialIterative(long n) {
        long result = 1;
        for (long i = n; i > 1; i--) {
            result *=i;
        }
        return result;
    }

    public long factorialRecursive(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();

        long input = 26;

        long start = System.currentTimeMillis();
        long result = fact.factorialIterative(input);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(String.format("%d! = %d in %d", input, result, elapsed));

        start = System.currentTimeMillis();
        result = fact.factorialRecursive(input);
        elapsed = System.currentTimeMillis() - start;
        System.out.println(String.format("%d! = %d in %d", input, result, elapsed));
    }
}
