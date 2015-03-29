package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;
	protected Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);

	public abstract boolean intersectsWith(Interval interval);
	
	public abstract boolean isIncluded(BothOpenedInterval interval);
	
	public abstract boolean isIncluded(LeftOpenedInterval interval);
	
	public abstract boolean isIncluded(RightOpenedInterval interval);
	
	public abstract boolean isIncluded(UnopenedInterval interval);

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
