package tdd.intervalHierarchy;

public class FromEndPointBuilder {

	private double point;
	
	private boolean isClosed;
		
	public FromEndPointBuilder(){
		this.point = 0;
		this.isClosed = true;
	}
	
	public FromEndPointBuilder point(double point) {
		this.point = point;
		return this;
	}

	public FromEndPointBuilder isClosed(boolean isClosed) {
		this.isClosed = isClosed;
		return this;
	}
	
	public FromEndPoint build() {
		return new FromEndPoint(point, isClosed);
	}
	
}