/**
 * Project Euler Problem 5
 */

/**
 * @author kennygao
 */
public class Problem5 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        int lower = 1;
        int upper = 20;
        long candidate = 1;

        // start with the product of the divisors as an upper bound for the answer
        for (int i = lower; i <= upper; i++) {
            candidate *= i;
        }

        // "pare down" the answer
        for (int i = lower; i <= upper; i++) {
            if (i == 1) continue;

            while (isDivisible(candidate / i, lower, upper)) {
                candidate /= i;
            }
        }

        System.out.println(candidate);
    }

    private static boolean isDivisible(long n, int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (n % i != 0) {
                return false;
            }
        }

        return true;
    }
}
