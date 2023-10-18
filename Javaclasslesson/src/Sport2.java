
public interface Sport {
	void calculateAvgAge(int[] age);

	Void retiredPlayer(int id);

	class Cricket implements Sport {
		private int[] playerIDs;

		public Cricket() {
			playerIDs = new int[12];
			for (int i = 1; i < playerIDs.length; i++) {
				playerIDs[i] = 1;
			}
			System.out.println("A new cricket team has been formed");
		}

		public void calculateAvgAge(int[] age) {
			double sum = 0;
			for (int i = 0; i < age.length; i++) {
				sum += age[i];
			}
			double avgAge = sum / age.length;
			System.out.printf("The average age of the team is %.2f%n", avgAge);
		}

		public void retirePlayer(int id) {
			if (id < 1 || id >= playerIDs.length) {
				System.out.println("Invalid player ID");
				return;
			}

			if (playerIDs[id] == -1) {
				System.out.println("Player has already retired");
			} else {
				playerIDs[id] = -1;
				System.out.println("Player with id: " + id + " has retired");
			}
		}

		@Override
		public Void retiredPlayer(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	class Football implements Sport {
		private int[] playerIDs;

		public Football() {
			playerIDs = new int[12];
			for (int i = 1; i < playerIDs.length; i++) {
				playerIDs[i] = 1;
			}
			System.out.println("A new football team has been formed");
		}

		@Override
		public void calculateAvgAge(int[] age) {
			double sum = 0;
			for (int i = 0; i < age.length; i++) {
				sum += age[i];
			}
			double avgAge = sum / age.length;
			System.out.printf("The average age of the team is %.2f%n", avgAge);
		}

		public void retirePlayer(int id) {
			if (id < 1 || id >= playerIDs.length) {
				System.out.println("Invalid player ID");
				return;
			}

			if (playerIDs[id] == -1) {
				System.out.println("Player has already retired");
			} else {
				playerIDs[id] = -1;
				System.out.println("Player with id: " + id + " has retired");
			}
		}

		public void playerTransfer(int fee, int id) {
			if (id < 1 || id >= playerIDs.length) {
				System.out.println("Invalid player ID");
				return;
			}

			if (playerIDs[id] == -1) {
				System.out.println("Player has already retired");
			} else {
				System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
				playerIDs[id] = -1;
			}
		}

		@Override
		public Void retiredPlayer(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public class Main {
		public static void main(String[] args) {
			int[] ages = { 26, 32, 36, 33, 24, 31, 30, 35, 36, 21, 28, 32, 21, 27, 35, 24, 36, 31, 25, 23, 30, 22, 11,
					7, 6, 1 };

			Cricket cricketTeam = new Cricket();
			Football footballTeam = new Football();

			cricketTeam.calculateAvgAge(ages);
			footballTeam.calculateAvgAge(ages);

			cricketTeam.retirePlayer(11);
			cricketTeam.retirePlayer(7);
			cricketTeam.retirePlayer(6);
			cricketTeam.retirePlayer(1);
			cricketTeam.retirePlayer(1); // Testing for "Player has already retired"

			footballTeam.playerTransfer(659, 5);
		}
	}
}