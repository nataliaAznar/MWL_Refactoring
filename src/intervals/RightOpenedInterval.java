package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum <= value && value < maximum;
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) 
			return interval.isIntersected(this);
		if (maximum == interval.minimum)
			return false;
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(minimum))
				&& this.isIncludedMaximum(interval);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(minimum))
				&& this.isIncludedMaximum(interval);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& this.isIncludedMaximum(interval);
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& this.isIncludedMaximum(interval);
	}
	
	private boolean isIncludedMaximum(Interval interval){
		return (interval.includes(maximum) || maximum == interval.maximum);
	}
	
	@Override
	public boolean isIntersected(LeftOpenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersectedMaximum(UnopenedInterval interval){
		return true;
	}

}
