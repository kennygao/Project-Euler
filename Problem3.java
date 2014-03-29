/**
 * Project Euler Problem 3
 */

/**
 * @author kennygao
 */
public class Problem3 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        long n = 600851475143l;

        // without a list of primes, it's easier to just try dividing n with all
        // integers, including composites
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                n /= i;
            }
        }

        System.out.println(n);
    }

}
