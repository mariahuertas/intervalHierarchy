package tdd.intervalHierarchy;

public class IntervalBuilder {

	private FromEndPointBuilder fromEndPointBuilder;
	private UntilEndPointBuilder untilEndPointBuilder;

	IntervalBuilder(){
		this.fromEndPointBuilder = new FromEndPointBuilder();
		this.untilEndPointBuilder = new UntilEndPointBuilder();
	}

	IntervalBuilder min (double min) {
		this.fromEndPointBuilder.point(min);
		return this;
	}

	IntervalBuilder max(double max) {
		this.untilEndPointBuilder.point(max);
		return this;
	}

	IntervalBuilder fromIsClosed (boolean isClosed) {
		this.fromEndPointBuilder.isClosed(isClosed);
		return this;
	}

	IntervalBuilder untilIsClosed (boolean isClosed) {
		this.untilEndPointBuilder.isClosed(isClosed);
		return this;
	}

	Interval build() {
		return new Interval(fromEndPointBuilder.build(), untilEndPointBuilder.build());
	}
}

