package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean includes(double value) {
		return minimum < value && value < maximum;
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) {
			return false;
		}
		if (maximum == interval.minimum) {
			return false;
		}
		return this.includes(interval.minimum)
				|| this.includes(interval.maximum);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
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
