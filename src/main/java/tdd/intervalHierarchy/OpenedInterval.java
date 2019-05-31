package tdd.intervalHierarchy;

public class OpenedInterval {
	protected double min;
	
	protected double max;

	public OpenedInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	protected boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.min) ||
		   this.isIncluded(another.max) ||
		   another.isIncluded(this.min) ||
			this.isSameInterval(another);
	}

	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
	
	private boolean isSameInterval(OpenedInterval another) {
		return this.min == another.min && another.max == this.max;
	}
}


