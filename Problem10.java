/**
 * Project Euler Problem 6
 */

import java.util.stream.LongStream;

/**
 * @author kennygao
 */
public class Problem10 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        long result = LongStream.range(2, 2_000_000).filter(Problem10::isPrime).sum();
        System.out.println("result = " + result);
    }

    private static boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

}
