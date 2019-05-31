package tdd.intervalHierarchy;

public abstract class IntervalBuilder {

	protected double min;

	protected double max;

	public IntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}

	protected IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	protected IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}

	protected abstract Interval build();

}
