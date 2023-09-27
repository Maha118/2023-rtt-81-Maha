package Iteration;

public class arrys {
	public static void main(String[] args) {
		int arraySize = 10;

		// this creates a new array of type double with 20 elements
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		// loop over the entire array and print the value i each location
		// its important to know that you can ask an array how long it is using .lenght
		for (int pos = 0; pos < arraySize; pos++) {
			System.out.println("The value in position " + pos + "is" + stringArray[pos]);
			// enhanced for loop
			for (String value : stringArray) {
				System.out.println("The value = " + value);
			}
			;
			// write a for loop that counts the number of nulls in the array
			// after the loop completes prints that number
			int nullCount = 0;
			for (String value : stringArray) {
				if (value == null) {
					nullCount = nullCount + 1;
				}
			}

		}
	}
}
