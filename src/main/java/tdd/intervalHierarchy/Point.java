package tdd.intervalHierarchy;

public class Point {

	protected double pointValue;
	protected boolean isClosed;
	
	protected boolean isFromEndPoint;

	Point(double point, boolean isClosed){
		this.pointValue = point;
		this.isClosed = isClosed;
	}

	public double getPointValue() {
		return this.pointValue;
	}

	public boolean getIfIsClosed() {
		return this.isClosed;
	}
	
	protected boolean isTheSame(Point another){
		if ((this.pointValue == another.getPointValue()) && this.isClosed && another.getIfIsClosed()) {
			return true;
		}
		return false;
	}

}
