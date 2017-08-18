package triangleIQAssessment;

import java.util.Random;

public class GameSolver {

	public static void main(String[] args) {
		Board board = new Board();
		Random random = new Random();
		Moves move;
		while (!board.gameIsWon()) {
			while (!board.gameIsOver()) {
				int number = random.nextInt(36);
				System.out.println(board.legalMoves.get(number).getStartingPoint() + " "
						+ board.legalMoves.get(number).getEndingPoint());
				move = board.legalMoves.get(number);
				board.makeMove(move);
				board.printBoard();
			}
			System.out.println("The game is finished.");
			board.boardReset();
		}
		System.out.println("The game is won.");

	}

}
