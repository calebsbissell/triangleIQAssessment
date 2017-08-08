package triangleIQAssessment;

import java.io.IOException;

public class Board {
	private char[] boardPosition = new char[15];
	public Board() {
		boardPosition[0] = 'O';
		for (int i = 1; i < 15; i++) {
			boardPosition[i] = 'X';
		}
	}
	

	public void printBoard()
	{
		System.out.println("Board positions are numbered roughly as follows:");
		System.out.println("     1    ");
		System.out.println("    2 3   ");
		System.out.println("   4 5 6  ");
		System.out.println("  7 8 9 10 ");
		System.out.println("11 12 13 14 15");
		System.out.println();
		System.out.println("An 'X' indicates a peg and an 'O' indicates an empty space:");
		System.out.println();
		System.out.println("    " + boardPosition[0] + "    ");
		System.out.println("   " + boardPosition[1] + " " + boardPosition[2] + "   ");
		System.out.println("  " + boardPosition[3] + " " + boardPosition[4] + " " + boardPosition[5] + "  ");
		System.out.println(" " + boardPosition[6] + " " + boardPosition[7] + " " + boardPosition[8] + " "
				+ boardPosition[9] + " ");
		System.out.println(boardPosition[10] + " " + boardPosition[11] + " " + boardPosition[12] + " "
				+ boardPosition[13] + " " + boardPosition[14]);

	}
	public void removePeg(int position) {
		boardPosition[position-1]= 'O';
	}
	public void addPeg(int position) {
		boardPosition[position-1]= 'X';
	}
}
