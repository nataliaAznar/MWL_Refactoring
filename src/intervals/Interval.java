package intervals;

public abstract class Interval {

	protected Point minimum;
	protected Point maximum;

	public Interval(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (maximum.getNumber() + minimum.getNumber()) / 2;
	}

	public abstract boolean intersectsWith(Interval interval);
	
	public boolean intersectsWithDefault(Interval interval){
		return (minimum.includes(interval.minimum)&&maximum.includes(interval.minimum))
				|| (minimum.includes(interval.maximum)&&maximum.includes(interval.maximum));
	}
	
	public boolean isIntersected(RightOpenedInterval interval){
		return false;
	}
	
	public boolean isIntersectedMinimum(UnopenedInterval interval){
		return false;
	}
	
	public boolean isIntersectedMaximum(UnopenedInterval interval){
		return false;
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
