package tdd.intervalHierarchy;

public class Interval {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;

	public Interval(FromEndPoint fromEndPoint, UntilEndPoint untilEndPoint) {
		this.fromEndPoint = fromEndPoint;
		this.untilEndPoint = untilEndPoint;
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.getFromEndPoint()) ||
				this.isIncluded(another.getUntilEndPoint()) ||
				another.isIncluded(this.getFromEndPoint()) ||
				this.isSameInterval(another);
	}

	private boolean isIncluded(Point another) {
		return this.fromEndPoint.isLeft(another) && this.untilEndPoint.isRight(another);
	}

	private boolean isSameInterval(Interval another) {
		return this.getFromEndPoint().getPointValue() == another.getFromEndPoint().getPointValue() && another.getUntilEndPoint().getPointValue() == this.untilEndPoint.getPointValue();
		
	}
	
	public Point getFromEndPoint () {
		return this.fromEndPoint;
	}
	
	public Point getUntilEndPoint () {
		return this.untilEndPoint;
	}
}

