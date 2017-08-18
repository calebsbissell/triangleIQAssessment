package triangleIQAssessment;


public class IQAssessor {

	public static void main(String[] args) {
		Board board = new Board();
	
		board.printBoard();
		board.makeMove(new Moves(4, 2, 1));
		board.printBoard();
		board.makeMove(new Moves(9, 5, 2));
		board.printBoard();
		board.makeMove(new Moves(4, 2, 1));
		System.out.println(board.gameIsOver());
		for (int i=1; i<=13;i++) {
		board.removePeg(i);
		}
		board.printBoard();
		System.out.println(board.gameIsWon());
		

		}
	}


