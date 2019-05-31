package tdd.intervalHierarchy;

public class Point {

	private double pointValue;
	private boolean isClosed;
	
	private boolean isFromEndPoint;

	Point(double point, boolean isClosed, boolean isFromEndPoint){
		this.pointValue = point;
		this.isClosed = isClosed;
		this.isFromEndPoint = isFromEndPoint;
	}

	public double getPointValue() {
		return this.pointValue;
	}

	public boolean getIfIsClosed() {
		return this.isClosed;
	}
	
	public boolean getisFromEndPoint() {
		return this.isFromEndPoint;
	}

	public void setPointValue(double point) {
		this.pointValue = point;
	}

	public void setIfIsClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	public boolean isLeft(Point another){
		if ((this.pointValue < another.getPointValue()) || this.isTheSame(another)) {
			return true;
		}
		return false;
	}

	public boolean isRight(Point another){
		if ((this.pointValue > another.getPointValue())|| this.isTheSame(another)) {
			return true;
		}
		return false;
	}
	
	public boolean isTheSame(Point another){
		if ((this.pointValue == another.getPointValue()) && this.isClosed && another.getIfIsClosed()) {
			return true;
		}
		return false;
	}

}
