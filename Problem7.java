/**
 * Project Euler Problem 6
 */

import java.util.stream.IntStream;

/**
 * @author kennygao
 */
public class Problem7 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        int result = IntStream.iterate(2, i -> i + 1).filter(Problem7::isPrime).skip(10000).findFirst().orElse(-1);
        System.out.println("result = " + result);
    }

    private static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

}
