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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endingPoint;
		result = prime * result + middlePoint;
		result = prime * result + startingPoint;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moves other = (Moves) obj;
		if (endingPoint != other.endingPoint)
			return false;
		if (middlePoint != other.middlePoint)
			return false;
		if (startingPoint != other.startingPoint)
			return false;
		return true;
	}

}
