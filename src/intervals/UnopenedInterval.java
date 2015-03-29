package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean includes(double value) {
		return minimum <= value && value <= maximum;
	}

	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		switch (interval.opening) {
		case BOTH_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		case LEFT_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		case RIGHT_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		case UNOPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		default:
			assert false;
			return false;
		}
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum)
			return interval.opening == Opening.LEFT_OPENED ||
					interval.opening == Opening.UNOPENED;
		if (maximum == interval.minimum) 
			return interval.opening == Opening.RIGHT_OPENED ||
			interval.opening == Opening.UNOPENED;
		return this.includes(interval.minimum)
				|| this.includes(interval.maximum);
	}
}
