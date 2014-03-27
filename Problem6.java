/**
 * Project Euler Problem 6
 */
package me.phra.projecteuler;

/**
 * @author kennygao
 */
public class Problem6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;

        System.out.println(squareOfSums - sumOfSquares);
    }

}
