package loopsandarryspa;

import java.util.Scanner;

public class looppa303_5_1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two positive integers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		int gcd = 1;
		int k = 2;

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		}

		System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);

		scanner.close();

	}

}
