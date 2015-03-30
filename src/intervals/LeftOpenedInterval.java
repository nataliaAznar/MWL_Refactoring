package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum < value && value <= maximum;
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) 
			return false;
		if (maximum == interval.minimum) 
			return interval.isIntersected(this);
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum));
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum));
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}
	
	@Override
	public boolean isIntersected(RightOpenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersectedMinimum(UnopenedInterval interval){
		return true;
	}

}
