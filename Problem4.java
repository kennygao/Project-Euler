/**
 * Project Euler Problem 4
 */
package me.phra.projecteuler;

/**
 * @author kennygao
 * 
 */
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int digits = 3;
		int ubound = (int) (Math.pow(10, digits) - 1); // e.g. 999
		int lbound = (int) Math.pow(10, digits - 1); // e.g. 100
		int largest = 0;

		// impossible for a power of 10 to be a factor of a palindromic number
		for (int a = ubound; a > lbound; a--) {
			// avoid redundant checks for both a * b and b * a
			for (int b = a; b > lbound; b--) {
				if (isPalindromic(a * b) && a * b > largest) {
					largest = a * b;
				}
			}
		}

		System.out.println(largest);
	}

	private static boolean isPalindromic(int n) {
		int digits = (int) Math.log10(n) + 1;

		// digits are 1-indexed, where digit 1 is the least significant
		for (int i = 1; i <= digits / 2; i++) {
			if (ithDigit(n, i) != ithDigit(n, digits - i + 1)) {
				return false;
			}
		}

		return true;
	}

	private static int ithDigit(int n, int i) {
		n /= Math.pow(10, i - 1);
		return n - n / 10 * 10;
	}
}
