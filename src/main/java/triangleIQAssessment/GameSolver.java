package triangleIQAssessment;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameSolver {

	public static void main(String[] args) {
		Board board = new Board();
		Random random = new Random();
		Moves move;
		int number[] = new int[13];
		while (!board.gameIsWon()) {
			for (int i = 0; i < 13; i++) {
				number[i] = random.nextInt(36);
			}
			while (!board.gameIsOver()) {
				
				
				
				
				
				for (int i = 0; i < 13; i++) { 
				System.out.println(board.legalMoves.get(number[i]).getStartingPoint() + " "
						+ board.legalMoves.get(number[i]).getEndingPoint());
				move = board.legalMoves.get(number[i]);
				board.makeMove(move);
				board.printBoard();
				}
			}
			System.out.println("The game is finished.");
			for (int j = 0; j < 13; j++) {
				for (int i = 0; i < 13; i++) {
				while (number[j]==number[i])
				number[j]= random.nextInt(36);
				}
				}
			}
			board.boardReset();
	System.out.println("The game is won.");	
	}
		

	}


