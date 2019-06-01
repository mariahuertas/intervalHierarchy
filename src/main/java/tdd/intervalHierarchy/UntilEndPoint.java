package tdd.intervalHierarchy;

public class UntilEndPoint extends Point {

	UntilEndPoint(double point, boolean isClosed) {
		super(point, isClosed);
	}

	public boolean isRight(Point another){
		return (this.pointValue > another.getPointValue())|| this.isTheSame(another);
	}
}
