package tdd.intervalHierarchy;

public class Interval {
	
	private Point fromEndPoint;
	private Point untilEndPoint;

	boolean isClosedInterval;

	public Interval(double min, double max, boolean fromIsClosed, boolean untilIsClosed) {
		this.fromEndPoint = new Point(min, fromIsClosed, true);
		this.untilEndPoint = new Point(max, untilIsClosed, true);
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.fromEndPoint) ||
				this.isIncluded(another.untilEndPoint) ||
				another.isIncluded(this.fromEndPoint) ||
				this.isSameInterval(this.fromEndPoint);
	}

	private boolean isIncluded(Point another) {
		if (this.fromEndPoint.isLeft(another) && this.untilEndPoint.isRight(another)) {
		return true;
		}
		return false;
	}

	private boolean isSameInterval(Point another) {
		return this.fromEndPoint.getPointValue() == another.fromEndPoint.getPointValue() && another.untilEndPoint.getPointValue() == this.untilEndPoint.getPointValue();
		
	}
}

