package tdd.intervalHierarchy;

public class Interval {
	protected double min;
	
	protected double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	protected boolean isIntersected(Interval another) {
		return this.isIncluded(another.min) ||
		   this.isIncluded(another.max) ||
		   another.isIncluded(this.min) ||
			this.isSameInterval(another);
	}

	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
	
	private boolean isSameInterval(Interval another) {
		return this.min == another.min && another.max == this.max;
	}
}


