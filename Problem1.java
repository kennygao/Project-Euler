/**
 * Project Euler Problem 1
 */
package me.phra.projecteuler;

/**
 * @author kennygao
 * 
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 1000;

		int threes = 3 * triangularNum(max / 3);
		int fives = 5 * triangularNum(max / 5);
		int fifteens = 15 * triangularNum(max / 15);

		// trivial application of principle of inclusion/exclusion
		System.out.println(threes + fives - fifteens);
	}

	private static int triangularNum(int n) {
		// returns the sum of integers between 1 and n, inclusive
		return n * (n + 1) / 2;
	}

}
