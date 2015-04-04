package intervals;

public class Interval {

	protected Point minimum;
	protected Point maximum;

	public Interval(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (maximum.getNumber() + minimum.getNumber()) / 2;
	}

	public boolean intersectsWith(Interval interval) {
		return (minimum.intersectsWith(interval.minimum)&&maximum.intersectsWith(interval.minimum))
				|| (minimum.intersectsWith(interval.maximum)&&maximum.intersectsWith(interval.maximum));
	}
	
	public boolean includes(Interval interval) {
		return minimum.includes(interval.minimum)&&minimum.includes(interval.maximum)&&
				maximum.includes(interval.minimum)&&maximum.includes(interval.maximum);
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

}
