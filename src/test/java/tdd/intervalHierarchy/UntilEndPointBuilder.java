package tdd.intervalHierarchy;

public class UntilEndPointBuilder {

	private double point;
	
	private boolean isClosed;
		
	public UntilEndPointBuilder(){
		this.point = 0;
		this.isClosed = true;
	}
	
	public UntilEndPointBuilder point(double point) {
		this.point = point;
		return this;
	}

	public UntilEndPointBuilder isClosed(boolean isClosed) {
		this.isClosed = isClosed;
		return this;
	}
	
	public UntilEndPoint build() {
		return new UntilEndPoint(point, isClosed);
	}
	
}