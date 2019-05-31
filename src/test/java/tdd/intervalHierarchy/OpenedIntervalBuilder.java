package tdd.intervalHierarchy;

public class OpenedIntervalBuilder extends IntervalBuilder {

	OpenedIntervalBuilder(){
		super();
	}
	
	@Override
	protected Interval build() {
		assert min <= max;
		return new Interval(min, max);
	}
}
