package loopsandarryspa;

import java.util.Arrays;

public class Array303_7_1 {
	public static void main(String[] args) {
	// Task 1
	int[] task1Array = new int[3];
	{
		task1Array[0] = 1;
		task1Array[1] = 2;
		task1Array[2] = 3;
		System.out.println("Task 1: Array elements: " + Arrays.toString(task1Array));

		// Task 2
		int[] task2Array = { 13, 5, 7, 68, 2 };
		int middleElement = task2Array[task2Array.length / 2];
		System.out.println("Task 2: Middle element: " + middleElement);

		// Task 3
		String[] colorsArray = { "red", "green", "blue", "yellow" };
		System.out.println("Task 3: Array length: " + colorsArray.length);
		String[] copiedArray = colorsArray.clone();
		System.out.println("Task 3: Copied Array: " + Arrays.toString(copiedArray));

		// Task 4
		int[] task4Array = { 10, 20, 30, 40, 50 };
		System.out.println("Task 4: First Element: " + task4Array[0]);
		System.out.println("Task 4: Last Element: " + task4Array[task4Array.length - 1]);

		try {
			System.out.println("Task 4: Value at index = length: " + task4Array[task4Array.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task 4: Exception caught: " + e.getMessage());
		}

		try {
			task4Array[5] = 60;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task 4: Exception caught: " + e.getMessage());
		}

		// Task 5
		int[] task5Array = new int[5];
		for (int i = 0; i < task5Array.length; i++) {
			task5Array[i] = i;
		}
		System.out.println("Task 5: Array elements: " + Arrays.toString(task5Array));

		
	}
	}
}
