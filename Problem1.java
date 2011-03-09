package me.phra.projecteuler;

import java.util.Scanner;

/**
 * @author kennygao
 * 
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt() - 1;

		int threes = 3 * triangularNum(max / 3);
		int fives = 5 * triangularNum(max / 5);
		int fifteens = 15 * triangularNum(max / 15);

		System.out.println(threes + fives - fifteens);
	}

	private static int triangularNum(int n) {
		return n * (n + 1) / 2;
	}

}
