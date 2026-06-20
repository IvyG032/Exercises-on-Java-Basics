import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		
		// Initialize 2D array for both players
		char[][] player1 = new char[5][5]; 
		char[][] player2 = new char[5][5]; 

		// Starts game and call functions
		System.out.println("Welcome to Battleship!");
		System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
		recordBattleShip(player1);
		printBattleShip(player1);
		System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
		recordBattleShip(player2);
		printBattleShip(player2);
		System.out.println("Player 1, enter hit row/column:");
		hitOrMiss(player1);

	}

// Use this method to take and save player steps
	private static void recordBattleShip(char[][] player) {
		// Place empty slots
		for(int r = 0; r < 5; r++) {
        	for(int c = 0; c < 5; c++) player[r][c] = '-';
        }
		// Ask player to enter coordinate for five times
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i ++) {	
			// Check for valid input
			boolean isValid = false; // The switch
			while (!isValid) {
				System.out.println("Enter ship " + (i+1) + " location: ");  // Record row and col as integers 
				int row = input.nextInt();
				int col = input.nextInt();

				if (isOutOfBounds(row,col)) { // Handle outofbounds error
					System.out.println("Invalid coordinates. Choose different coordinates.");
				}
				// Check if existed
				else if (player[row][col] == '@') {
					System.out.println("You already have a ship there. Choose different coordinates.");
				}
				else {
					player[row][col] = '@'; // Place ship at valid location
					isValid = true; // Switch to true to end loop
				}
			}	
		}
	}

// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}

// Use this method to check if location is out of bounds
	private static void isOutOfBounds(row,col) {
		if (row < 0 || row > 4 || col < 0 || col > 4) { // Handle outofbounds error
		System.out.println("Invalid coordinates. Choose different coordinates.");
		}
	}

// Use this method to check hit & miss
	private static void hitOrMiss(char[][] player) {

	}



