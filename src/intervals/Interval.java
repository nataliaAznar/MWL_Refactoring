package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;

	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public abstract boolean intersectsWith(Interval interval);
	
	public abstract boolean includes(Interval interval);
	
	public abstract boolean includes(double value);
	
	public abstract boolean isIncluded(BothOpenedInterval interval);
	
	public abstract boolean isIncluded(LeftOpenedInterval interval);
	
	public abstract boolean isIncluded(RightOpenedInterval interval);
	
	public abstract boolean isIncluded(UnopenedInterval interval);
	
	public boolean intersectsWithDefault(Interval interval){
		return this.includes(interval.minimum)
				|| this.includes(interval.maximum);
	}
	
	public boolean isIntersected(LeftOpenedInterval interval){
		return false;
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
