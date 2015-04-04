package intervals;

public abstract class Point {
	private double number;

	public Point(double number) {
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	public boolean includes(Point p){
		return true;
	}
	
	public abstract boolean isIncluded(FromPoint p);
	
	public abstract boolean isIncluded(UntilPoint p);
	
	@Override
	public boolean equals(Object object) {
		Point point = (Point) object;
		return point.getNumber() == point.getNumber();
	}

}
