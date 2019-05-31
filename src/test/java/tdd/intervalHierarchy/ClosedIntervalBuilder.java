package tdd.intervalHierarchy;

public class ClosedIntervalBuilder {

	private double min;
	
	private double max;
	
	private boolean isClosedInterval;
	
	ClosedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.isClosedInterval = true;
	}
	
	ClosedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	ClosedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	Interval build() {
		assert min <= max;
		return new Interval(min, max, isClosedInterval);
	}

	
}