package tdd.intervalHierarchy;

public class FromEndPoint extends Point{

	FromEndPoint(double point, boolean isClosed) {
		super(point, isClosed);
	}

	public boolean isLeft(Point another){
		return (this.pointValue < another.getPointValue()) || this.isTheSame(another);
	}
}
