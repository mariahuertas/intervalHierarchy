package tdd.intervalHierarchy;

public class Interval {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;

	boolean isClosedInterval;

	public Interval(double min, double max, boolean fromIsClosed, boolean untilIsClosed) {
		this.fromEndPoint = new FromEndPoint(min, fromIsClosed);
		this.untilEndPoint = new UntilEndPoint(max, untilIsClosed);
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.getFromEndPoint()) ||
				this.isIncluded(another.getUntilEndPoint()) ||
				another.isIncluded(this.getFromEndPoint()) ||
				this.isSameInterval(another);
	}

	private boolean isIncluded(Point another) {
		if (this.getFromEndPoint().isLeft(another) && this.getUntilEndPoint().isRight(another)) {
		return true;
		}
		return false;
	}

	private boolean isSameInterval(Interval another) {
		return this.getFromEndPoint().getPointValue() == another.getFromEndPoint().getPointValue() && another.getUntilEndPoint().getPointValue() == this.untilEndPoint.getPointValue();
		
	}
	
	
	public FromEndPoint getFromEndPoint () {
		return this.fromEndPoint;
	}
	
	public UntilEndPoint getUntilEndPoint () {
		return this.untilEndPoint;
	}
}

