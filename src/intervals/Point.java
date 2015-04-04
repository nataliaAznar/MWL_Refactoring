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
	
	public boolean isIncluded(ExactPoint p) {
		if( p.getType().equals(Type.MAXIMUM))
			return p.getNumber() >= this.getNumber();
		else
			return p.getNumber() <= this.getNumber();
	}
	
	public abstract boolean intersectsWith(Point p);
	
	@Override
	public boolean equals(Object object) {
		Point point = (Point) object;
		return point.getNumber() == point.getNumber();
	}

}
