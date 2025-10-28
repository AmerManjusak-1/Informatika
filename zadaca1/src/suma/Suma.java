package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		int a, b, c, d, e;
		int sumaP = 0, sumaNep = 0;

		Scanner tastatura = new Scanner(System.in);

		System.out.println("Vnesete go prviot broj:");
		a = tastatura.nextInt();

		System.out.println("Vnesete go drugiot broj:");
		b = tastatura.nextInt();

		System.out.println("Vnesete go tretiot broj:");
		c = tastatura.nextInt();

		System.out.println("Vnesete go chetvrtiot broj:");
		d = tastatura.nextInt();

		System.out.println("Vnesete go petiot broj:");
		e = tastatura.nextInt();

		// Smetanje za site broevi
		int[] broevi = { a, b, c, d, e };

		for (int i = 0; i < 5; i++) {
			if (broevi[i] % 2 == 0) {
				sumaP += broevi[i];
			} else {
				sumaNep += broevi[i];
			}
		}

		System.out.println("Sumata na parnite broevi: " + sumaP);
		System.out.println("Sumata na neparnite broevi: " + sumaNep);

		tastatura.close();
	}
}
