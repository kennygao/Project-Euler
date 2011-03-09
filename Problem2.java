/**
 * Project Euler Problem 2
 */
package me.phra.projecteuler;

/**
 * @author kennygao
 * 
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 4000000;

		int a = 1;
		int b = 2;
		int sum = 0;

		while (b < max) {
			sum += b;
			int tmp = a + 2 * b;
			b = tmp + a + b;
			a = tmp;
		}

		System.out.println(sum);
	}

}
