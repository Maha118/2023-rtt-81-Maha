package loopsandarryspa;

public class Array303_6_1 {
	// example one
	public static void main(String[] args) {
		// Create an array
		int[] age = { 12, 4, 5, 2, 5 };

		// Access each array element
		System.out.println("Accessing Elements of an Array:");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);

		// Example Two

		// Create an array
		int[] age1 = { 12, 4, 5 };

		// Loop through the array using a for loop
		System.out.println("Using for Loop:");
		for (int i = 0; i < age1.length; i++) {
			System.out.println(age1[i]);
		}

	}
}