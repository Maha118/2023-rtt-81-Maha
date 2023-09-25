package condtionalstatments;

public class NestedVschained {
	public static void main(String[] args) {
		int score = 70;

		if (score >= 90.0) {
			System.out.print("A");
		} else if (score >= 80.0) {
			System.out.print("B");
		} else if (score >= 70.0) {
			System.out.print("c");
		} else if (score >= 60.0) {
			System.out.print("D");
		} else
			System.out.print('F');
	}

}
