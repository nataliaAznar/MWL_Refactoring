package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(ExactPoint minimum, UntilPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() <= value && value < maximum.getNumber();
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum.getNumber() == interval.maximum.getNumber()) 
			return interval.isIntersected(this);
		if (maximum.getNumber() == interval.minimum.getNumber())
			return false;
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(minimum.getNumber()))
				&& this.isIncludedMaximum(interval);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(minimum.getNumber()) || minimum.getNumber() == interval.minimum.getNumber())
				&& this.isIncludedMaximum(interval);
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(minimum.getNumber()) || minimum.getNumber() == interval.minimum.getNumber())
				&& this.isIncludedMaximum(interval);
	}
	
	private boolean isIncludedMaximum(Interval interval){
		return (interval.includes(maximum.getNumber()) || maximum.getNumber() == interval.maximum.getNumber());
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
