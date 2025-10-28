package najgolemiotbroj;

import java.util.Scanner;

public class Najgolemiotbroj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Najgolem od n vcitani broevi");
		int n, x, max;
		System.out.print("Kolku broevi ke proveruvas: ");
		n = input.nextInt();
		System.out.print("Vnesi 1. broj: ");
		x = input.nextInt();
		max = x;
		for (int i = 2; i <= n; i++) {
			System.out.print("Vnesi " + i + ". broj: ");
			x = input.nextInt();
			if (x > max) {
				max = x;
			}
		}

		System.out.println("Najgolem broj e: " + max);
	}
}
