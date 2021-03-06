package intervals;

public abstract class Point {
	private double number;

	public Point(double number) {
		this.number = number;
	}

	public double getNumber() {
		return number;
	}
	
	public abstract boolean includes(Point p);
	
	public abstract boolean isIncluded(FromPoint p);
	
	public abstract boolean isIncluded(UntilPoint p);
	
	public boolean isIncluded(FromExactPoint p) {
		return p.getNumber() <= this.getNumber();
	}
	
	public boolean isIncluded(UntilExactPoint p) {
		return p.getNumber() >= this.getNumber();
	}
	
	public abstract boolean intersectsWith(Point p);
	
	public abstract boolean isIntersected(FromExactPoint p);
	public abstract boolean isIntersected(UntilExactPoint p);
	
	@Override
	public boolean equals(Object object) {
		Point point = (Point) object;
		return point.getNumber() == point.getNumber();
	}

}
