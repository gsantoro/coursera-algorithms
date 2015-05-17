package various;

/**
 * Created by gsantoro on 17/05/15.
 */
public class Fibonacci {
    public static long fibonacci(long n) {
        int previous = 1, result = 1, temp = 0;
        for(int i=2; i<= n; i++) {
            temp = result;
            result += previous;
            previous = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int input = 11;
        long result = fibonacci(input);

        System.out.println(String.format("f(%d) = %d", input, result));
    }
}
