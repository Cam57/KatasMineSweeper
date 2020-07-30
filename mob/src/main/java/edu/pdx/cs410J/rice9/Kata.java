package edu.pdx.cs410J.rice9;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    String[][] board = new String[4][4];
    board[0][1] = "*";
    board[0][2] = ".";
    board[0][3] = ".";
    board[0][4] = ".";
    board[1][1] = ".";
    board[1][2] = ".";
    board[1][3] = ".";
    board[1][4] = ".";
    board[2][1] = ".";
    board[2][2] = "*";
    board[2][3] = ".";
    board[2][4] = ".";
    board[3][1] = ".";
    board[3][2] = ".";
    board[3][3] = ".";
    board[3][4] = ".";
    for (int i = 0; i < 4; i++) {
	for (int j = 0; j < 4; j++) {
	    if (board[i][j].equals("."))
		board[i][j] = "0";
	}
    }
    for (int i = 0; i < 4; i++) {
	for (int j = 0; j < 4; j++) {
	    if (board[i][j].equals("*")) {
		if (i - 1 >= 0) { //Left side is clear
		    if (j + 1 < 4) { //Top side is clear
                board[i - 1][j + 1] = Integer.toString(Integer.parseInt(board[i - 1][j + 1]) + 1);
                board[i][j + 1] = Integer.toString(Integer.parseInt(board[i][j + 1]) + 1);
            }
			if(j - 1 >= 0) { //Bottom side is clear
                board[i-1][j-1] = Integer.toString(Integer.parseInt(board[i - 1][j-1]) + 1);
                board[i][j-1] = Integer.toString(Integer.parseInt(board[i][j-1]) + 1);
            }
            board[i - 1][j] = Integer.toString(Integer.parseInt(board[i-1][j]) + 1);
        }
		    
		if (i + 1 > 3)
		if (j - 1 >= 0)
		if (j + 1 >= 3)
	    }
	}
    }
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}
