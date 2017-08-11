package triangleIQAssessment;

public class GameSolver {

	public static void main(String[] args) {
		Board board = new Board();
		int moveCounter = 1;
		while (moveCounter < 2) {
			for (Moves temp : board.legalMoves) {
				board.makeMove(temp.getStartingPoint(), temp.getMiddlePoint(), temp.getEndingPoint());
				board.printBoard();
				if (board.moveIsPossible(temp)) {
						moveCounter++;
				}
			}
		}
	}

}
