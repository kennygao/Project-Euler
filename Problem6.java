/**
 * Project Euler Problem 6
 */
package me.phra.projecteuler;

import java.util.stream.IntStream;

/**
 * @author kennygao
 */
public class Problem6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        explicit();
        stream();
    }

    private static void explicit() {
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;

        System.out.println(squareOfSums - sumOfSquares);
    }

    private static void stream() {
        int sumOfSquares = IntStream.rangeClosed(1, 100).map(i -> i * i).sum();
        int sum = IntStream.rangeClosed(1, 100).sum();
        int squareOfSums = sum * sum;

        System.out.println(squareOfSums - sumOfSquares);
    }

}
