/**
 * Project Euler Problem 2
 */

/**
 * @author kennygao
 */
public class Problem2 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        int max = 4000000;

        int a = 1;
        int b = 2;
        int sum = 0;

        // only every third Fibonacci number is even, so we can compress the
        // math and iterate three times faster than a naive algorithm.
        while (b < max) {
            sum += b;
            int tmp = a + 2 * b;
            b = tmp + a + b;
            a = tmp;
        }

        System.out.println(sum);
    }

}
