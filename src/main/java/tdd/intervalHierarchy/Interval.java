package tdd.intervalHierarchy;

public class Interval {
	private double min;
	private boolean isMinClosed;

	private double max;
	private boolean isMaxClosed;


	boolean isClosedInterval;

	public Interval(double min, double max, boolean isClosedInterval) {
		this.min = min;
		this.max = max;
		this.isClosedInterval = isClosedInterval;
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.min, another.isClosedInterval) ||
				this.isIncluded(another.max, another.isClosedInterval) ||
				another.isIncluded(this.min, this.isClosedInterval) ||
				this.isSameInterval(another);
	}

	private boolean isIncluded(double value, boolean isClosedInterval) {
		if (this.isClosedInterval && isClosedInterval ) {
			return this.min <= value && value <= this.max;
		}
		
		return this.min < value && value < this.max;
	}

	private boolean isSameInterval(Interval another) {
		return this.min == another.min && another.max == this.max;
	}
}

