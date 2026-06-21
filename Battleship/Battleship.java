import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		
		// Initialize 2D array for both players
		char[][] player1 = new char[5][5]; 
		char[][] player2 = new char[5][5]; 

		// Call scanner in main
		Scanner mainScanner = new Scanner(System.in);

		// Initializes winner to 0 that represents no winner yet
		int winner = 0;

		// Starts game and call functions
		System.out.println("Welcome to Battleship!");
		System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
		recordBattleShip(player1, mainScanner);
		printBattleShip(player1, true);
		System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
		recordBattleShip(player2, mainScanner);
		printBattleShip(player2, true);

		while (winner == 0) {
			System.out.println("Player 1, enter hit row/column:");
			attackShip(player2, mainScanner);
			printBattleShip(player2, false);
		}

		mainScanner.close();

	}

// Use this method to take and save player steps
	private static void recordBattleShip(char[][] player, Scanner input) {
		// Place empty slots
		for(int r = 0; r < 5; r++) {
        	for(int c = 0; c < 5; c++) player[r][c] = '-';
        }
		// Ask player to enter coordinate for five times
		for (int i = 0; i < 5; i ++) {	
			// Check for valid input
			boolean isValid = false; // The switch
			while (!isValid) {
				System.out.println("Enter ship " + (i+1) + " location: ");  // Record row and col as integers 
				int row = input.nextInt();
				int col = input.nextInt();

				if (invalidLocation(row,col)) {
					//If out of bound, !validLocation = True, isValid = False, restart loop
				}
				else if (locationExisted(player, row, col)) { // Check if coordinates are valid
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
// Modified to add a switch that controls how the game board is printed
	private static void printBattleShip(char[][] player, boolean showShip) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					char currentLocation = player[row][column];
					// If switch is off, don't show ship
					if (currentLocation == '@' && !showShip) {
						System.out.print("- ");
					}
					else{
						System.out.print(currentLocation + " ");
					}
				}
			}
			System.out.println("");
		}
	}

// Use this method to check if location is out of bounds
	private static boolean invalidLocation(int row,int col) {
		if (row < 0 || row > 4 || col < 0 || col > 4) { // Handle outofbounds error
		System.out.println("Invalid coordinates. Choose different coordinates.");
		return true;
		}
		else {
			return false;
		}
	}
	
// Use this method to check if locaion already existed
	private static boolean locationExisted(char[][] player, int row, int col){
		return player[row][col] == '@';	
	}

// Use this method to check hit & miss
	private static void attackShip(char[][] player, Scanner input) {
		
		int row = input.nextInt();
		int col = input.nextInt();
		
		
		if (locationExisted(player, row, col)){
			player[row][col] = 'X';
			System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
		}
		else{
			System.out.println("PLAYER 1 MISSED!");
			player[row][col] = 'O';
		}
	}
}

