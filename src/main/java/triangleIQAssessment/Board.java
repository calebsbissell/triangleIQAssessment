package triangleIQAssessment;

import java.util.HashSet;
import java.util.Set;

public class Board {
	private char[] boardPosition = new char[15];
	Set<Moves> legalMoves = new HashSet<Moves>();
	legalMoves.add(new Moves(1,2,4));
	legalMoves.add(new Moves(4,2,1));
	legalMoves.add(new Moves(1,3,6));
	legalMoves.add(new Moves(6,3,1));
	legalMoves.add(new Moves(7,4,2));
	legalMoves.add(new Moves(2,4,7));
	legalMoves.add(new Moves(3,6,10));
	legalMoves.add(new Moves(10,6,3));
	legalMoves.add(new Moves(4,7,11));
	legalMoves.add(new Moves(11,7,4));
	legalMoves.add(new Moves(6,10,15));
	legalMoves.add(new Moves(15,10,6));
	legalMoves.add(new Moves(11,12,13));
	legalMoves.add(new Moves(13,12,11));
	legalMoves.add(new Moves(12,13,14));
	legalMoves.add(new Moves(14,13,12));
	legalMoves.add(new Moves(15,14,13));
	legalMoves.add(new Moves(13,14,15));
	legalMoves.add(new Moves(14,9,5));
	legalMoves.add(new Moves(5,9,14));
	legalMoves.add(new Moves(12,9,6));
	legalMoves.add(new Moves(6,9,12));
	legalMoves.add(new Moves(8,9,10));
	legalMoves.add(new Moves(10,9,8));
	legalMoves.add(new Moves(12,8,5));
	legalMoves.add(new Moves(5,8,12));
	legalMoves.add(new Moves(13,8,4));
	legalMoves.add(new Moves(4,8,13));
	legalMoves.add(new Moves(7,8,9));
	legalMoves.add(new Moves(9,8,7));
	legalMoves.add(new Moves(2,5,9));
	legalMoves.add(new Moves(2,5,9));
	legalMoves.add(new Moves(3,5,8));
	legalMoves.add(new Moves(8,5,3));
	legalMoves.add(new Moves(4,5,6));
	legalMoves.add(new Moves(6,5,4)); 
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
