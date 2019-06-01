package tdd.intervalHierarchy;

public abstract class Point {

	protected double pointValue;
	protected boolean isClosed;

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
		return (this.pointValue == another.getPointValue()) && this.isClosed && another.getIfIsClosed();
	}

}
