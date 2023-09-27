package iterationloopsarrays;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
		int[] numbers = {0,1, 2, 3, 4, 5  
	};
		System.out.println("original = " + Arrays.toString(numbers));
		
		int positionToDelete = 2;
		for (int pos = positionToDelete; pos < numbers.length - 1; pos++) {
			
			System.out.println("after move = " + Arrays.toString(numbers));
			
			// make a new array that is one smaller than the original
			int[] target = new int [numbers.length - 1];
			for (int pos = ; pos < target.length; pos++) {
				target[pos] = numbers[pos];}
			
			
			
			}

}
