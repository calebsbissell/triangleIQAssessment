package triangleIQAssessment;

public class IQAssessor {

	public static void main(String[] args) {
		Board board = new Board();
		
		board.printBoard();
		
		board.removePeg(15);
		
		board.printBoard();
		
		board.removePeg(8);
		
		board.printBoard();
		
		board.addPeg(15);
		
		board.printBoard();
	}

}
