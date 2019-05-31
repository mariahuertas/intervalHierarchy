package tdd.intervalHierarchy;

public class OpenedIntervalBuilder {

	
	private double min;
	
	private double max;
	
	private boolean isClosedInterval;
	
	OpenedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.isClosedInterval = false;
	}
	
	OpenedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	OpenedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	OpenedInterval build() {
		assert min <= max;
		return new OpenedInterval(min, max, isClosedInterval);
	}
}