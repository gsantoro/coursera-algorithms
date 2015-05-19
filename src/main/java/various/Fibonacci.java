package various;

/**
 * Created by gsantoro on 17/05/15.
 */
public class Fibonacci {
    public static long fibonacciIterative(long n) {
        long previous = 1, result = 1, temp = 0;

        for(int i=2; i<= n; i++) {
            temp = result;
            result += previous;
            previous = temp;
        }

        return result;
    }

    public static long fibonacciRecursive(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        long input = 100;

        long start = System.currentTimeMillis();
        long result = fibonacciIterative(input);
        long expired = System.currentTimeMillis() - start;
        System.out.println(String.format("f(%d) = %d in %d", input, result, expired));


        start = System.currentTimeMillis();
        result = fibonacciRecursive(input);
        expired = System.currentTimeMillis() - start;
        System.out.println(String.format("f(%d) = %d in %d", input, result, expired));
    }
}
