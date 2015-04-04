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
		if (minimum.getNumber() == interval.maximum.getNumber()) 
			return false;
		if (maximum.getNumber() == interval.minimum.getNumber()) 
			return interval.isIntersected(this);
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()) || maximum.getNumber() == interval.maximum.getNumber());
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()));
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return this.isIncludedMinimum(interval)
				&& (interval.includes(maximum.getNumber()) || maximum.getNumber() == interval.maximum.getNumber());
	}
	
	private boolean isIncludedMinimum(Interval interval){
		return (interval.includes(minimum.getNumber()) || minimum.getNumber() == interval.minimum.getNumber());
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
