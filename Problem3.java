/**
 * Project Euler Problem 3
 */
package me.phra.projecteuler;

/**
 * @author kennygao
 * 
 */
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 600851475143l;

		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				n /= i;
			}
		}

		System.out.println(n);
	}

}
