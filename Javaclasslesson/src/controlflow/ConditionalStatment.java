package controlflow;

import java.util.Scanner;

// question number one
public class ConditionalStatment {
	public static void main(String[] args) {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		// Change the value of x to 15
		x = 15;
		System.out.println("Less than 10");

		// question number two
		int y = 7; // Declare and initialize x with the value 7

		if (y < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}

		// Question number Three

		int z = 15; // Declare and initialize x with the value 15

		if (z < 10) {
			System.out.println("Less than 10");
		} else if (z >= 10 && z < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
		// Question number Four
		int A = 15; // Declare and initialize A with the value 15

		if (A < 10 || A > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}
		// Question number Five

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the score");
		int score = scanner.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("Score out of range");
		} else if (score >= 90 && score <= 100) {
			System.out.println("Grade: A");
		} else if (score >= 80 && score < 90) {
			System.out.println("Grade: B");
		} else if (score >= 70 && score < 80) {
			System.out.println("Grade: C");
		} else if (score >= 60 && score < 70) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

		scanner.close();

	}
}