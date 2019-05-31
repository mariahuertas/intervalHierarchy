package tdd.intervalHierarchy;

public class ClosedInterval extends OpenedInterval {

	public ClosedInterval(double min, double max) {
		super(min, max);
	}

	@Override
	protected boolean isIncluded(double value) {
		return super.isIncluded(value) || this.min == value || this.max ==value;
	}

}