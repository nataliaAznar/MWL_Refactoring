package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean includes(double value) {
		return minimum <= value && value < maximum;
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) 
			return interval.opening == Opening.LEFT_OPENED ||
					interval.opening == Opening.UNOPENED;
		if (maximum == interval.minimum)
			return false;
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(minimum))
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(minimum))
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

}
