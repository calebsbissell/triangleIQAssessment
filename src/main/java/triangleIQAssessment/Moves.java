package triangleIQAssessment;

public class Moves {
	private int startingPoint, endingPoint, middlePoint;

	public Moves(int startingPoint, int middlePoint, int endingPoint) {
		
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
		this.middlePoint = middlePoint;
	}

	public int getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getEndingPoint() {
		return endingPoint;
	}

	public void setEndingPoint(int endingPoint) {
		this.endingPoint = endingPoint;
	}

	public int getMiddlePoint() {
		return middlePoint;
	}

	public void setMiddlePoint(int middlePoint) {
		this.middlePoint = middlePoint;
	}

}
