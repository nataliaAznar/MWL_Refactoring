package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(FromPoint minimum, ExactPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() < value && value <= maximum.getNumber();
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
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()));
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()) || maximum == interval.maximum);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()));
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()) || maximum == interval.maximum);
	}
	
	private boolean isIncludedMinimum(Interval interval){
		return (interval.includes(minimum.getNumber()) || minimum == interval.minimum);
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
