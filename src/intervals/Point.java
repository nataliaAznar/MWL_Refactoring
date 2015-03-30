package intervals;

public class Point {
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
	
	@Override
	public boolean equals(Object object) {
		Point point = (Point) object;
		return point.getNumber() == point.getNumber();
	}

}
