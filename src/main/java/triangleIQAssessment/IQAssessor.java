package triangleIQAssessment;

public class IQAssessor {

	public static void main(String[] args) {
		Board board = new Board();
		
		board.printBoard();
		board.makeMove(4, 2, 1);
		board.printBoard();
		board.makeMove(9, 5, 2);
		board.printBoard();
		board.makeMove(4, 2, 1);
		System.out.println(board.gameIsOver());
		for (int i=1; i<=14;i++) {
		board.removePeg(i);
		}
		board.printBoard();
		System.out.println(board.gameIsOver());
	}

}
